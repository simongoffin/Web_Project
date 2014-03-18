<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test des expressions EL</title>
    </head>
    <body>
    <p>
        <%@ page isELIgnored ="false" %>
        <% 
        /* Cr�ation d'une Map */
        java.util.Map<String,Integer> desserts = new java.util.HashMap<String, Integer>();
        desserts.put("cookies", 8);
        desserts.put("glaces", 3);
        desserts.put("muffins", 6);
        desserts.put("tartes aux pommes", 2);
        
        request.setAttribute("desserts" , desserts);
        %>
        
        <!-- Les quatre syntaxes suivantes retournent la valeur associ�e � la cl� "cookies" de la Map de desserts  -->
        ${ desserts.cookies }<br />
        ${ desserts.get("cookies") }<br />
        ${ desserts['cookies'] }<br />
        ${ desserts["cookies"] }<br />

        <% 
        /* Cr�ation d'une cha�ne nomm�e "element" et contenant le mot "cookies" */
        String element = "cookies"; 
        request.setAttribute("element",element);
        %>
        <!-- Il est �galement possible d'utiliser un objet au lieu d'initialiser la cl� souhait�e directement dans l'expression -->
        ${ desserts[element] }<br />
    </p>
    </body>
</html>