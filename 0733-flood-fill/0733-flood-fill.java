class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {
        if(image[sr][sc]==newcolor){
            return image;
        }
        flood(image,image[sr][sc],newcolor,sr,sc);
        return image;
        
    }
    public static void flood(int[][] image,int color,int newcolor,int sr,int sc){
            if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=color){
                return ;
            }
            image[sr][sc]=newcolor;

            flood(image,color,newcolor,sr-1,sc);
            flood(image,color,newcolor,sr+1,sc);
            flood(image,color,newcolor,sr,sc-1);
            flood(image,color,newcolor,sr,sc+1);

        }
}