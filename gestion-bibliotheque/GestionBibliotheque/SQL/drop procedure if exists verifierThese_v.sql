drop procedure if exists verifierThese_v2; 

delimiter //

create procedure verifierThese_v2(titre varchar(500) ) 
begin 
	declare nbrDispo int ; 

	select count(et.titre) into nbrDispo
	from empruntthese et
    where et.titre = titre;  

	if nbrDispo != 0 then

		select count(et.titre) into nbrDispo
		from empruntthese et, these t
		where et.titre = t.titre
		and dateretour is not null
		and t.titre = titre; 

		if nbrDispo > 0 then 

			select distinct a.nom, a.prenom, t.titre, count(distinct t.titre) as nbrDispo
			from these t, ecrirethese et, auteur a
			where t.titre = et.titreThese
			and et.idAuteur = a.id
			and t.titre = titre; 
        else
            select distinct a.nom, a.prenom , t.titre, '0' as nbrDispo
            from these t, ecrirethese et, auteur a
            where t.titre = et.titreThese 
            and et.idAuteur = a.id
            and t.titre = titre; 


        end if; 
    else 
        select distinct a.nom, a.prenom , t.titre, '1' as nbrDispo
        from these t, ecrirethese et, auteur a
        where t.titre = et.titreThese 
        and et.idAuteur = a.id
        and t.titre = titre; 
        
    end if; 

end; 
// 
delimiter ; 