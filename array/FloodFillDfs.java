
public class FloodFillDfs {
	//logic
    public void dfs(int r,int c,int image[][],int nc,int n,int m,int curr){
        if(r<0 || r>=n || c<0 || c>=m || image[r][c]!=curr || image[r][c]==nc) return;
        image[r][c]=nc;
        dfs(r+1,c,image,nc,n,m,curr);//down
        dfs(r,c+1,image,nc,n,m,curr);//right
        dfs(r-1,c,image,nc,n,m,curr);//top
        dfs(r,c-1,image,nc,n,m,curr);//left
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        int n=image.length,m=image[0].length;
        int currC=image[sr][sc];
        dfs(sr,sc,image,newColor,n,m,currC);
        return image;
    }

}
