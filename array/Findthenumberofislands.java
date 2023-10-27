
public class Findthenumberofislands {
public void   dfs(char mat[][],int row,int col,int x,int y){
        
        if(x<0  || x>=row ||y<0 || y>=col || mat[x][y]!='1' )
            return;
        
            mat[x][y]='2';
            dfs(mat,row,col,x+1,y);//top
            dfs(mat,row,col,x-1,y);//down
            dfs(mat,row,col,x,y+1);//right
            dfs(mat,row,col,x,y-1);//left
            
        }
    
    public int numIslands(char[][] grid) {
        int c=0;
        int row= grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++)
        
        for(int j=0;j<col;j++){
            
            if(grid[i][j] == '1'){
                dfs(grid,row,col,i,j);
                c++;
            }
        }
        return c;
    }

}
