# SpringBoot-Unidirectional-Mapping
========================================
 Non Collection 1...1 , *...1
 Collection 1...* ,  *...*
 => Two tables are connected using PK-FK Concept.
 i.e one table РК Connected with another table FK

 Steps for coding
===================
1)Define two classes
2)Create HAS-A variable in Parent Class
3)Check for Collection or Non-Collection
4)Apply Multiplicity Annotation at HAS-A variable
    1...1<br>
       @OneToOne<br>
    1...*<br>
       @OneToMany<br>
    *...1<br>
       @ManyToOne<br>
    *...*<br>
       @ManyToMany<br>

5)Add JoinColum / JohnTable(**** at HAS-A variable
