<h2> Text about Software Engineering </h2>
<p> "We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

Titus Winters, Software Engineering at Google </p>

<h2>Comentário</h2>
<p> De modo geral, a engenharia de software e a programação estão relacionados entre si, porém a engenharia de software abrange mais tarefas além da própria programação. O engenheiro de software precisa não apenas desenvolver o programa, como também realizar a manutenção dos códigos quando necessário, ou até mesmo modificá-lo por completo, por isso o tempo é tão importante nesta área.</p>

<h2> Qual é o trade-off em relação ao API </h2>

<p> Neste API, de acordo com a escolha dos requisitos, acredito que o trade-off seria poder dar o controle de acesso pro cliente, podendo guardar os dados por eles criados, a partir do sistema criado pela linguagem de programação escolhida (no caso o Java Desktop juntamente com o SGBD MySQL)</p>
<p> Entretanto, fazer a conexão entre a linguagem e o banco é o lado ruim deste trade-off, pois existem outras linguagens que fazem esta conexão de maneira mais simples.</p>

<h2> Atividades de Requisitos </h2>
<h3> --> Exemplo: Sistema para Biblioteca </h3>

<h3> Requisitos Funcionais e Não-Funcionais:  </h3>

**Requisitos Funcionais:**

<p> • Poder adicionar, alterar e excluir livros </p>
<p> • Visualizar livros que estão disponíveis para comprar e para alugar </p>
<p> • Poder buscar o livro desejado pelo nome do livro ou pelo nome do autor. </p>
<p> • Poder comparar o preço entre livros (de 2 em 2). </p>

<br>

**Requisitos Não-Funcionais:**

<p> • Utilzar o padrão MVC para ter uma melhor organização </p>
<p> • Poder interagir dinamicamente com o sistema (neste exemplo, utilizando o console para tal) </p>

**Funcionalidades que podem ser acrescentadas no futuro:**
<p> • Painel para feedbacks do cliente. </p>
<p> • Painel de suporte ao cliente. </p>
<p> • Interface intuitiva. </p>

<h2> Diagrama de Caso de Uso </h2>
<img src="imagens/Diagrama de Caso de Uso certo.jpg">

<br>

<h2> Diagrama de Classes </h2>
<img src="imagens/Diagrama de Classes.jpg">

<h2> Classe Livro </h2>
<img src="imagens/img classe Livro pt1.PNG">
<img src="imagens/img classe Livro pt2.PNG">

<br>

<h2> Classe Biblioteca </h2>
<img src="imagens/img classe Biblioteca pt1.PNG">
<img src="imagens/img classe Biblioteca pt2.PNG">

<br>

<h2> Classe Principal </h2>
<img src="imagens/img classe Principal pt1.PNG">
<img src="imagens/img classe Principal pt2.PNG">
