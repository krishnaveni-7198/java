package app1;

class Publisher {
String publisher ;
Publisher ( String publi ){
this . publisher = publi ;
}
}
class Book {
String name ;
Publisher publisher ;
Book ( ) { }
public Book ( String name , Publisher publisher ) {
this . name = name ;
this . publisher = publisher ;
}
}
class Literature extends Book{
String Littype = "literature";
Literature ( String name , Publisher publisher ) {
super ( name , publisher ) ;
}
void display ( ) {
System . out .println ( "Name: "+ super . name ) ;
System . out . println ( "Type : " + this . Littype ) ;
System . out . println ( "Publisher: " + this . publisher . publisher ) ;
}
}
class Fiction extends Book{
String Littype = "Fiction ";
Fiction ( String name , Publisher publisher ) {
super ( name , publisher) ;
}
void display ( ) {
System . out .println ( "Name: "+ super . name ) ;
System . out . println ( "Type : " + this . Littype ) ;
System . out . println ( " Publisher : "+ this . publisher . publisher ) ;
}
}
public class InheritenceBook {
public static void main ( String [ ] args ){
Publisher lp = new Publisher ( "S . Chand" ) ;
Literature l = new Literature ( "As you like it " , lp ) ;
l . display ( ) ;
Publisher fp = new Publisher ( "Tata McGraw H i l l" ) ;
Fiction f = new Fiction ( "Tempest " , fp ) ;
f . display ( ) ;
}
}