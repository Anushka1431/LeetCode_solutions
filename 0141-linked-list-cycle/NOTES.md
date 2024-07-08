take a slow and a fast pointer . the fats pointer moves ahead by 2 and slow by 1. if there is no cycle the fats will move ahead and get null. but if there is a cycle in the list then te fast pointer will lopp and will join the slow pointer at some point signalling that there is a cycle.

how to find how many nodes in a cycle?
where the slow and the fast pointer meet, keep the fast pointer there only and make the slow move again till it reaches the fast pointer once more in the loop. or take a temp and make it move with a do temp=temp.next and len++ while temp!=slow loop.​
