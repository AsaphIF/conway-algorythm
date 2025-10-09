<h1 align="center">🌱 Jogo da Vida de Conway </h1>
<p align="center">
  Uma implementação simples do autômato celular de John Conway, simulando a evolução de células vivas em uma grade bidimensional.
</p>

<hr />

<h2>📋 Índice</h2>

<ul>
  <li><a href="#sobre">Sobre</a></li>
  <li><a href="#regras">Regras do Jogo</a></li>
  <li><a href="#como-executar">Como Executar</a></li>
  <li><a href="#exemplo">Exemplo</a></li>
  <li><a href="#contribuicao">Contribuição</a></li>
  <li><a href="#contato">Contato</a></li>
</ul>

---

<h2 id="sobre">📖 Sobre</h2>

<p>
  O <strong>Jogo da Vida de Conway</strong> é um autômato celular desenvolvido pelo matemático britânico John Horton Conway em 1970. Apesar de ser chamado de "jogo", ele não possui jogadores nem objetivos; é uma simulação matemática que evolui com base em regras simples. Este projeto implementa o jogo utilizando Python e a biblioteca Pygame para visualização.
</p>

---

<h2 id="regras">📜 Regras do Jogo</h2>

<p>
  O jogo é jogado em uma grade bidimensional infinita de células quadradas, cada uma das quais pode estar em um dos dois estados: viva ou morta. A evolução do jogo segue as seguintes regras:
</p>

<ul>
  <li><strong>Subpopulação:</strong> Qualquer célula viva com menos de dois vizinhos vivos morre.</li>
  <li><strong>Sobrepopulação:</strong> Qualquer célula viva com mais de três vizinhos vivos morre.</li>
  <li><strong>Estabilidade:</strong> Qualquer célula viva com dois ou três vizinhos vivos permanece viva para a próxima geração.</li>
  <li><strong>Reprodução:</strong> Qualquer célula morta com exatamente três vizinhos vivos se torna uma célula viva.</li>
</ul>

<p>
  Essas regras são aplicadas simultaneamente a todas as células da grade, e a evolução das células é determinada por seu estado atual e o número de vizinhos vivos ao redor delas.
</p>

---

<h2 id="como-executar">🚀 Como Executar</h2>

<p>
  Para rodar o Jogo da Vida de Conway em sua máquina, siga os passos abaixo:
</p>

<pre>
<code>
# Clonar o repositório
git clone https://github.com/AsaphIF/conway-algorythm.git
cd conway-algorythm

# Instalar as dependências
pip install -r requirements.txt

# Executar o jogo
python game_of_life.py
</code>
</pre>

<p>
  Certifique-se de ter o Python 3.x instalado em sua máquina. O script <code>game_of_life.py</code> inicializa a simulação e exibe a evolução das células em uma janela gráfica.
</p>

---

<h2 id="exemplo">📸 Exemplo</h2>

<p>
  Abaixo está uma captura de tela da simulação em execução:
</p>

<p align="center">
  <img src="https://www.geeksforgeeks.org/wp-content/uploads/2020/03/Game-of-Life-1.png" alt="Jogo da Vida de Conway" width="600"/>
</p>

<p>
  Nesta imagem, as células pretas representam células vivas, enquanto as células brancas representam células mortas. A evolução das células segue as regras mencionadas anteriormente, criando padrões complexos e interessantes ao longo do tempo.
</p>

---

<h2 id="contribuicao">🤝 Contribuição</h2>

<p>
  Contribuições são bem-vindas! Para contribuir com este projeto:
</p>

<ol>
  <li>Faça um fork deste repositório.</li>
  <li>Crie uma branch para sua feature: <code>git checkout -b feature/nova-feature</code>.</li>
  <li>Faça commit das suas alterações: <code>git commit -am 'Adiciona nova feature'</code>.</li>
  <li>Envie para o repositório remoto: <code>git push origin feature/nova-feature</code>.</li>
  <li>Abra um Pull Request detalhando suas alterações.</li>
</ol>

---

<h2 id="contato">📬 Contato</h2>

<p>
  Para dúvidas ou sugestões, entre em contato:
</p>

<ul>
  <li><strong>Autor:</strong> Asaph</li>
  <li><a href="https://github.com/AsaphIF">GitHub: @AsaphIF</a></li>
</ul>
