//create an adjacency list i.e a list of ists to create a graph
//create an array to keep track of in degrees
//add empty arraylists to the adjacency list 
//travel the prrequisites array and and each list has course at 0 and prerec at 1 . add the course to the adjacency list of that prerec
//increase the indegree of that course 
//add the courses of 0 indegree to queue
//process the queue and reduce indegree of adjacent edges

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList=new ArrayList<>();
        int[] indeg=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] prereq:prerequisites){
            int course=prereq[0];
            int prerequisite=prereq[1];
            adjList.get(prerequisite).add(course);
            indeg[course]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indeg[i]==0){
                q.add(i);
            }
        }

        int processedcourses=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            processedcourses++;

            for(int nextcourse:adjList.get(curr)){
                indeg[nextcourse]--;
                if(indeg[nextcourse]==0){
                    q.add(nextcourse);
                }
            }
        }
return processedcourses==numCourses;
    }
    
}