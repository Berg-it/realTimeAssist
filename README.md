# real Time Assist

- Pour sécuriser des url regarde le fichier WebSecurityConfig.java.
- Pour chiffrer le mot de passe utilisateur on utilise le méthode "passwordEncoder" de spring boot. 

example:
```
    //ce bean est déjà décalrer dans not spring sécurité config "WebSecurityConfig" 
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	//Injecter ce bean dans notre service pour faire l'encodage.
	@Autowired
	private PasswordEncoder passwordEncoder;

	user.setPassword(passwordEncoder.encode(accountDto.getPassword()));

```
	
=> Pour plus d'info regarder l'article suivante: http://www.baeldung.com/spring-security-registration-password-encoding-bcrypt


Exemple de token:
```
{
  "ROLE": "ROLE_ADMIN",
  "firstName": "Amine\n",
  "lastName": "Berguiga",
  "sub": "admin",
  "aud": "web",
  "exp": 2380205495,
  "iat": 1516205495
}
```
