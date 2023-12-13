.class public Cadena
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100

   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "cadena"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return

.end method