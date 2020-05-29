class TreeGenerator{

    boolean treeDone = false;
    float startX;
    float startY;
    float thickness;
    float height;

    public TreeGenerator(float startX, float startY){
        this.startX = startX;
        this.startY = startY;
    }

    public void generateTree(){
        int i = 0;
        while(treeDone == false){
            if(i == 0){
               firstRect();
            }
        }
    }

    private void firstRect(){
        this.thickness = random(6, 30);
        this.height = random(8,50);
        quad(startX, startY, startX, startY + height, startX + thickness, startY + height, startX + thickness, startY);
    }

}