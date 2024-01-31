package com.persistence.vo;

class Planet {
    //    protected void revolve() { //line n1
//    }
//
//    abstract void rotate(); //line n2
    // OCA58
    public String name;
    public int moons;

    //
    public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

    public static void main(String[] args) {
        Planet[] planets = {
                new Planet("Mercury", 0),
                new Planet("Venus", 0),
                new Planet("Earth", 1),
                new Planet("Mars", 2)
        };

        System.out.println(planets);
        System.out.println(planets[2].name);
        System.out.println(planets[2].moons);
    }
}

class Earth extends Planet {
//    void revolve() { //line n3
//    }

    protected void rotate() { //line n4
    }
}