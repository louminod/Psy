---


---

<h1 id="bdd-settings">Bdd settings</h1>
<p>Il faut commencer par créer l’utilisateur :</p>
<pre><code>CREATE USER psy_admin IDENTIFIED BY admin;  
GRANT CONNECT TO psy_admin;  
GRANT CREATE SESSION TO psy_admin;  
GRANT UNLIMITED TABLESPACE TO psy_admin;
</code></pre>

