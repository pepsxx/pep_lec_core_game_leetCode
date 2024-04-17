package Pp_T01.Pp_L27_Package;
// Импорт класса Pc_Tree из пакета Pp_T01.Pp_L27_Lesson27.Pp_Forest
// import Pp_T01.Pp_L27_Lesson27.Pp_Forest.Pc_Tree;
// import Pp_T01.Pp_L27_Lesson27.Pp_Forest.Pc_Squirrel;
// Pp_T01.Pp_L27_Lesson27.Pp_Forest.* - Импортируются только классы пакета Pp_T01.Pp_L27_Lesson27.Pp_Forest, но не классы внутренних пакетов

import Pp_T01.Pp_L27_Package.Pp_Forest.*;
import Pp_T01.Pp_L27_Package.Pp_Forest.Pp_Something.Pc_SomeClass;

public class Pc_T01L27 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=7VZRmUjuS1g
    //Java для начинающих. Урок 27: Пакеты.
    public static void main(String[] args) {
        Pc_Tree po_tree = new Pc_Tree();
        Pc_Squirrel po_squirrel = new Pc_Squirrel();
        Pc_SomeClass po_someClass = new Pc_SomeClass();
    }
}