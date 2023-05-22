/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxing;

/**
 *
 * @author Acer
 */
    class Person implements Comparable<Person> {

        public String nama;
        public int umur;
        public Float berat;
        public Float tinggi;
        
        @Override
        public int compareTo(Person other){
            return this.nama.compareTo(other.nama);
        }


    }
