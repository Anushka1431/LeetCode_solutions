
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int max=0;
        stack.push(0);
        for(int i=1;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                max=maxsum(stack,heights,max,i);
            }
            
            stack.push(i);
            
        }
        
            int i=heights.length;
            while(!stack.isEmpty()){
                max=maxsum(stack,heights,max,i);
            }
        return max;

    }
    public int maxsum(Stack<Integer> stack,int[] arr, int max, int i){
        int area;
        int popped=stack.pop();
        if(stack.isEmpty()){
            area=arr[popped]*i;
        }
        else{
            area=arr[popped]*(i-1-stack.peek());
        }
         max=Math.max(max,area);

        return max;
    }
    
}
/*
Step-by-Step Execution
Initialization
stack = []
max = 0
Iterating Through the Histogram
i = 0

heights[0] = 2
stack.push(0)
stack = [0]
i = 1

heights[1] = 1
heights[1] < heights[stack.peek()] (1 < 2)
Enter the while loop and pop from the stack:
popped = stack.pop() (popped = 0)
stack = []
Calculate area:
Since stack is empty, area = heights[popped] * i = 2 * 1 = 2
Update max: max = Math.max(0, 2) = 2
stack.push(1)
stack = [1]
i = 2

heights[2] = 5
stack.push(2)
stack = [1, 2]
i = 3

heights[3] = 6
stack.push(3)
stack = [1, 2, 3]
i = 4

heights[4] = 2
heights[4] < heights[stack.peek()] (2 < 6)
Enter the while loop and pop from the stack:
popped = stack.pop() (popped = 3)
stack = [1, 2]
Calculate area:
area = heights[popped] * (i - 1 - stack.peek()) = 6 * (4 - 1 - 2) = 6 * 1 = 6
Update max: max = Math.max(2, 6) = 6
Continue in the while loop (heights[4] < heights[stack.peek()] (2 < 5)):
popped = stack.pop() (popped = 2)
stack = [1]
Calculate area:
area = heights[popped] * (i - 1 - stack.peek()) = 5 * (4 - 1 - 1) = 5 * 2 = 10
Update max: max = Math.max(6, 10) = 10
stack.push(4)
stack = [1, 4]
i = 5

heights[5] = 3
stack.push(5)
stack = [1, 4, 5]
Final Pass Through the Stack
i = 6 (i.e., heights.length)
While stack is not empty:
Pop from the stack:
popped = stack.pop() (popped = 5)
stack = [1, 4]
Calculate area:
area = heights[popped] * (i - 1 - stack.peek()) = 3 * (6 - 1 - 4) = 3 * 1 = 3
Update max: max = Math.max(10, 3) = 10
Pop from the stack:
popped = stack.pop() (popped = 4)
stack = [1]
Calculate area:
area = heights[popped] * (i - 1 - stack.peek()) = 2 * (6 - 1 - 1) = 2 * 4 = 8
Update max: max = Math.max(10, 8) = 10
Pop from the stack:
popped = stack.pop() (popped = 1)
stack = []
Calculate area:
Since stack is empty, area = heights[popped] * i = 1 * 6 = 6
Update max: max = Math.max(10, 6) = 10 */