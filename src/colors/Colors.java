package colors;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Colors extends Canvas implements Serializable{
//BUAT WARNA 
private Color color;
private boolean rect;
public Colors(){
rect=false; setSize(300,150); //UKURAN CANVAS
change();}
public boolean getRect(){
return rect;}
public void setRect(boolean flag){
this.rect=flag; repaint();}
public void change(){
color = randomColor();
repaint();}
private Color randomColor(){
int r=(int)(255*Math.random());
int g =(int)(255*Math.random());
int b=(int)(255*Math.random());
return new Color(r,g,b);}
public void paint(Graphics g){
Dimension d = getSize();
int h=d.height;
int w=d.width;
int []x = {0,0,2};  
int []y = {1,0,3}; 

// SEGITIGA KIRI
g.setColor(color);
Polygon p=new Polygon();     
p.addPoint(20, 75);  //kiri atas
p.addPoint(20, 75);  //kiri bawah
p.addPoint(70, 125);  //kanan bawah
p.addPoint(70, 25);  //kanan atas
g.fillPolygon(p);

// LINGKARAN
g.setColor(color);
g.fillOval(100, 25, 100, 100); //pojok atas kiri, pojok atas kanan, width, height)

//SEGITIGA KANAN
g.setColor(color);
Polygon q=new Polygon();     
q.addPoint(230, 25);  //kiri atas
q.addPoint(230, 125);  //kiri bawah
q.addPoint(280, 75);  //kanan bawah
q.addPoint(280, 75);  //kanan atas
g.fillPolygon(q);


}
}
