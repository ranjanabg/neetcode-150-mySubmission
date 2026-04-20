class Solution {
    Map<Integer, List<Integer>> preMap = new HashMap<>();
    Set<Integer> visiting = new HashSet<>();
    //Set<Integer> visited = new HashSet<>(); // avoid reprocessing finished course
    List<Integer> output = new ArrayList<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        for (int i = 0; i < numCourses; i++) {
            preMap.put(i, new ArrayList<>());
        }

        for (int[] pre :prerequisites) {
            preMap.get(pre[0]).add(pre[1]);
        }

        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course)) {
                return new int[0];
            }
        }

        //Collections.reverse(output);
        return output.stream().mapToInt(i -> i).toArray();
    }

    private boolean dfs(int course) {
        if (visiting.contains(course)) {
            return false;
        }

        if (output.contains(course)) {
            return true;
        }

        visiting.add(course);
        for (int pre : preMap.get(course)) {
            if (!dfs(pre)) {
                return false;
            }
            
        }

        visiting.remove(course);
        //visited.add(course);
        output.add(course);
        return true;
    }
}
