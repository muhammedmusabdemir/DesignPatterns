package CreationalDP.FactoryDP;

/*public*/ class Triangle implements Shape{

    private String name;

    private int angle;

    private int edge;

    public Triangle(String name, int angle, int edge) {
        this.name = name;
        this.angle = angle;
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println(this.name + " cizildi. Aci: " +angle +" Kenar: " + this.edge);
    }
}
