package org.example;

import java.awt.*;

public class MapGenerator {

    public  int[][] map;

    public  int brickwidth;
    public int brickheight;

    public MapGenerator(int row,int col){
        map=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                map[i][j]=1;
            }
        }
        brickwidth=540/col;
        brickheight=150/row;
    }

    public  void setBrick(int value,int r,int c){
        map[r][c]=value;
    }

    public  void draw(Graphics2D g){

        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                if(map[i][j]>0){
                    g.setColor(Color.white);
                    g.fillRect(j*brickwidth+80,i*brickheight+80,brickwidth,brickheight);
                    g.setColor(Color.black);
                    g.setStroke(new BasicStroke(3));
                    g.drawRect(j*brickwidth+80,i*brickheight+80,brickwidth,brickheight);
                }
            }

        }


    }
}
