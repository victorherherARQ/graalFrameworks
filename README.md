# Quarkus

<ul>
<li><b>Definición General RedHat:</b> https://www.redhat.com/es/topics/cloud-native-apps/what-is-quarkus</li>
<li><b>Reactivo vs imperativo:</b> https://developers.redhat.com/blog/2019/11/18/how-quarkus-brings-imperative-and-reactive-programming-together/</li>
</ul>

# GRAALVM

## ¿Para que usar Graal?

<p> Graal nos referencia al siguiente articulo donde aparecen 10 de las razones más importantes para usar Graal</p>

[¿Por qué usar GRAALVM?](https://medium.com/graalvm/graalvm-ten-things-12d9111f307d)

<p>Nosotros nos vamos a centrar en 4 de ellos, que pueden ser interesantes para su inclusión en producción:</p>

### GRAAL Como Compilador JIT (Just In Time)

<p>Uno de los primeros pasos que se pueden hacer con Graal es usarlo como compilador Just In Time, Twitter lo usa en producción.</p>

<p>GraalVM 19.3.0 es distribuida como Community Edition y Enterprise Edition. La lista de entregables es la siguiente:</p>

<ol>
<li>GraalVM Enterprise Edition based on Oracle Java 8u231</li>
<li>GraalVM Community Edition based on OpenJDK 8u232</li>
<li>GraalVM Enterprise Edition based on Oracle Java 11.0.5</li>
<li>GraalVM Community Edition based on OpenJDK 11.0.5</li>
</ol>

### GRAAL como Compilador AOT(Ahead Of Time)

<p>Así disminuimos el "problema" del arranque lento y la huella memoria</p>

<p>Java como plataforma es particularmente fuerte para procesos long-running y con picos de rendimiento. Pero si que sufre con procesos short-running y un alto uso de memoria </p>

### GRAAL para Combinar varios lenguajes de programación (Javascript, Java, Ruby y R)

<p>Para poder utilizar todo ello se utiliza un nuevo framework que se llama:</p>

[Truffle](https://github.com/oracle/graal/tree/master/truffle)

<p>De tal manera que Truffle utiliza Graal por detrás genera el compilado con el lenguaje interpretado</p>

### GRAAL para Lenguajes Nativos (C, C++)

<p>Otro lenguaje que soportar Graal es C y otros lenguajes que generen LLVM como C++ y Fortran. Generando LLVM bitcode, utilizando para ello por ejemplo:

[Clang](https://clang.llvm.org/) y [lli](https://releases.llvm.org/1.0/docs/CommandGuide/lli.html) command (un interprete LLVM bitcode )</p>

# Herramientas útiles para trabajar con Graal y Frameworks AOT

<ul>
<li><b>Sdkman: </b>https://sdkman.io/</li>
<li><b>Pluggin Visual Studio Code for Quarkus: </b>https://marketplace.visualstudio.com/items?itemName=redhat.vscode-quarkus&ssr=false#overview</li>
</ul>

# Frameworks AOT

## Quarkus

<ul>
<li><b>Getting Started:</b> https://quarkus.io/get-started/</li>
<li><b>New Project:</b> https://code.quarkus.io/</li>
</ul>

### Comandos de utilidad

<ul>
<li>Compilar y desarrollar: <code>$mvn compile quarkus:dev</code></li>
<li>Listar las extensiones de quarkus: <code>$mvn quarkus:list-extensions</code></li>
<li>Añadir extensión: <code>$ mvn quarkus:add-extension -Dextensions="groupId:artifactId"</code></li>
<li>Generar un jar nativo:<code> mvn package -Pnative</code>

</ul>

## Micronaut

<ul>
<li>
<b>Getting Started:</b> https://guides.micronaut.io/creating-your-first-micronaut-app/guide/</li>
<li><b>New Project:</b>  <code>$ mn create-app micronaut --build maven</code></li>
</ul>
