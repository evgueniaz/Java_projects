package LaptopLibrary;

import java.util.Objects;

public class Laptop {
    
    public String brand;
    public int ram;
    public int ssd;
    public int hdd;
    public String color;
    public String processor;
    public double screen;
    

    public Laptop(String brand, int ram, int ssd, int hdd, String color, String processor, double screen) {
        this.brand = brand;
        this.ram = ram;
        this.ssd = ssd;
        this.hdd = hdd;
        this.color = color;
        this.processor = processor;
        this.screen = screen;
        
    }

    public boolean medSup()
    {
        return true;
    }

    @Override
    public String toString() {
        // return "Laptop [brand=" + brand + ", ram=" + ram + ", ssd=" + ssd + ", hdd=" + hdd + ", color=" + color + ", processor=" + processor
        //         + ", screen=" + screen + "]";
        return String.format("Brand: % \n RAM: %d Gb \n SSD %d Gb \n HHD: %d Gb Color: %s \n Processor: %s \n Screen diagonal: %.1f ", this.brand, this.ram, this.ssd, this.hdd, this.color, this.processor, this.screen);
    }


    @Override
    public int hashCode() {
        // final int prime = 31;
        // int result = 1;
        // result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        // result = prime * result + ram;
        // result = prime * result + ssd;
        // result = prime * result + hdd;
        // result = prime * result + ((color == null) ? 0 : color.hashCode());
        // result = prime * result + ((processor == null) ? 0 : processor.hashCode());
        // long temp;
        // temp = Double.doubleToLongBits(screen);
        // result = prime * result + (int) (temp ^ (temp >>> 32));
        // result = prime * result + (int) (id ^ (id >>> 32));
        // return result;
        return Objects.hash(brand, ram, ssd, hdd, color, processor, screen);
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Laptop laptop = (Laptop) obj;
        return ram == laptop.ram && ssd == laptop.ssd && hdd == laptop.hdd && color == laptop.color && processor == laptop.processor && screen == laptop.screen;
    }

    // return false;
        
    

    public int getRam(){
        return this.ram;
    }
    public int getStorageCap(){
        return this.ssd;
    }
    public int getOS(){
        return this.hdd;
    }
    public double getDiagonal(){
        return this.screen;
    }
    
}
    

