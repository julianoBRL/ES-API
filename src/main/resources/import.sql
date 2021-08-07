/*
 *	Auto Seeder
 *  
 */


/*#######################################
 *  
 * User Insert
 * 
 * ######################################
 */

insert into user values("3f00f2d2-f53a-11eb-9bd5-025076325304","$2a$10$zKNsiyEoSAIDKNClNGWN3uXuhj3YBD3GRONBkvRsIl4GfVkF8/km2","ADMIN","admin")


/*#######################################
 *  
 * Company Insert
 * 
 * ######################################
 */

insert into company values("b2dacd9d-f53a-11eb-9bd5-025076325304","ubsoft@gmail.com","ubsoft");
insert into company values("b2dcd8e4-f53a-11eb-9bd5-025076325304","valve@gmail.com","valve");
insert into company values("b2ddd775-f53a-11eb-9bd5-025076325304","nintendo@gmail.com","nintendo");
insert into company values("b2dec266-f53a-11eb-9bd5-025076325304","microsoft@gmail.com","microsoft");


/*#######################################
 *  
 * Plataform Insert
 * 
 * ######################################
 */
insert into plataform values("b117ac91-f53c-11eb-9bd5-025076325304","nintendo 3DS","2DS");
insert into plataform values("b114ee1e-f53c-11eb-9bd5-025076325304","nintendo 2DS","2DS");
insert into plataform values("b115be28-f53c-11eb-9bd5-025076325304","Atari800","PS1");
insert into plataform values("b1171a48-f53c-11eb-9bd5-025076325304","Atari800","Atari800");


/*#######################################
 *  
 * System Insert
 * 
 * ######################################
 */
insert into systems values("53f76847-f53e-11eb-9bd5-025076325304","~/rooms/2DS","execute 2dsemulator %{Room_Name}%",".2ds .ds .zip","b114ee1e-f53c-11eb-9bd5-025076325304");
insert into systems values("53f87a76-f53e-11eb-9bd5-025076325304","~/rooms/3DS","execute 3dsemulator %{Room_Name}%",".3ds .ds .zip","b117ac91-f53c-11eb-9bd5-025076325304");
insert into systems values("53f9291a-f53e-11eb-9bd5-025076325304","~/rooms/atari800","execute atari800semulator %{Room_Name}%",".bin .zip","b1171a48-f53c-11eb-9bd5-025076325304");
insert into systems values("53fa0f8c-f53e-11eb-9bd5-025076325304","~/rooms/playstation","execute ps1emulator %{Room_Name}%",".ps1 .ps .zip","b115be28-f53c-11eb-9bd5-025076325304")


/*#######################################
 *  
 * Genre Insert
 * 
 * ######################################
 */
insert into genre values("d1af6089-f540-11eb-9bd5-025076325304","RPG","RPG");
insert into genre values("d1b00387-f540-11eb-9bd5-025076325304","Moba","Moba");
insert into genre values("d1b0daa4-f540-11eb-9bd5-025076325304","FPS","FPS");
insert into genre values("d1b270fa-f540-11eb-9bd5-025076325304","Ação","Ação");

/*#######################################
 *  
 * Game Insert
 * 
 * ######################################
 */
insert into game values("5134ccc4-f54c-11eb-9bd5-025076325304","Super Mario","[binary data]","2020-04-04","Super Mario","~/rooms/3ds/supermario.zip","1","1","0,5","2020-04-04","[binary data]","b2ddd775-f53a-11eb-9bd5-025076325304","d1af6089-f540-11eb-9bd5-025076325304","b2ddd775-f53a-11eb-9bd5-025076325304","53f87a76-f53e-11eb-9bd5-025076325304");