class Box {
    int width;
    int height;
    int depth;

    Box() {//один раз создаешь и вытаскиваешь
        width = 10;
        height = 10;
        depth = 10;
    }

    int getVolume() {
        return width * height * depth;
    }
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }


}

//private int Cat();
//Cat(); конструктор


/*Box(int w, int h, int d){
    width = w;
    height = h;
    depth = d;
}
Box carbox = new Box(100,200, 100);
System.out,println("gjhki"+catbox.getVolume());
*/
