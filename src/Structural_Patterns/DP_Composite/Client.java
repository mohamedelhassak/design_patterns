package Structural_Patterns.DP_Composite;

public class Client {
    public static void main(String[] args) {
        Folder root = new Folder("GINF3");
        Folder f1 = new Folder("design patterns");
        Folder f2 = new Folder("Architecture Orientée Service et Processus Métiers");


        File file1 = new File("TP1_SOAP.docx");
        File file2 = new File("TP2_Rest.docx");

        File file3 = new File("TP_DP_Decorator.pdf");
        File file4 = new File("TP_DP_Factory.pdf");

        root.addComponent(f1);
        root.addComponent(f2);

        f1.addComponent(file3);
        f1.addComponent(file4);

        f2.addComponent(file1);
        f2.addComponent(file2);

        root.afficher();
    }
}
