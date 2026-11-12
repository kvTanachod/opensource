/**
 * Project Name: Disaster & Environment Damage Calculator
 * License: MIT License
 * Author: (ธนโชติ สุวรรณวาณิช)
 * Student ID / Class: (67219030017)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files.
 */

public class CreativeDamageCalculator {

    /**
     * ฟังก์ชันคำนวณความเสียหายเชิงสร้างสรรค์
     */
    public static double calculateDamage(double inputVal1, double inputVal2) {
        // 1. คำนวณค่าความเสียหายตามสูตรที่นักเรียนออกแบบ
        double rawDamage = inputVal1 * inputVal2 * 1000 - 50 ; // เติมสมการคำนวณ

        // 2. บูรณาการภูมิคุ้มกัน: เช็กขอบเขตข้อมูลเพื่อป้องกันไม่ให้ผลลัพธ์เป็นลบ
        if (rawDamage < 0) {
            return 0 ; // คืนค่าความเสียหายเป็น 0
        }
        
        return rawDamage;
    }

    public static void main(String[] args) {
        // กำหนดค่าตัวแปรทดสอบ
        double testInput1 = 2.5 ; 
        double testInput2 = 4.0 ; 

        // เรียกใช้งานฟังก์ชัน
        double result = calculateDamage(testInput1, testInput2);

        // แสดงผลลัพธ์การทำงาน
        System.out.println("==========================================");
        System.out.println("ระบบประมวลผลความเสียหายเชิงสร้างสรรค์");
        System.out.println("ผลการคำนวณความเสียหายที่เกิดขึ้น: " + result + " หน่วย");
        System.out.println("==========================================");
    }
}
