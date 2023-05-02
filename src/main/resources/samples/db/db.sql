INSERT INTO blogger(blogger_id)
VALUES(DEFAULT);
INSERT INTO blogger(blogger_id)
VALUES(DEFAULT);
INSERT INTO blogger(blogger_id)
VALUES(DEFAULT);
INSERT INTO blogger(blogger_id)
VALUES(DEFAULT);

INSERT INTO blogger_profile(blogger_profile_id,firstname,lastname,birthdate,gender,phone,work,bio,blogger_id)
VALUES(DEFAULT,"Alisson", "Banner", "2022-12-24 08:22:00", "Female", "555-123-4444", "Programmer", "Any random description", 1);

INSERT INTO blogger_profile(blogger_profile_id,firstname,lastname,birthdate,gender,phone,work,bio,blogger_id)
VALUES(DEFAULT,"Melody", "Marks", "2022-12-24 08:22:00", "Female", "555-123-4444", "Actress", "Any random description", 2);

INSERT INTO blogger_profile(blogger_profile_id,firstname,lastname,birthdate,gender,phone,work,bio,blogger_id)
VALUES(DEFAULT,"Arnold", "Swazenagger", "2022-12-24 08:22:00", "Male", "555-123-4444", "Actor", "Any random description", 3);

INSERT INTO blogger_profile(blogger_profile_id,firstname,lastname,birthdate,gender,phone,work,bio,blogger_id)
VALUES(DEFAULT,"Josep", "Serway", "2022-12-24 08:22:00", "Male", "555-123-4444", "Admin", "Any random description", 4);

INSERT INTO blogger_follower(blogger_id, follower_id)
VALUES(1,2);
INSERT INTO blogger_follower(blogger_id, follower_id)
VALUES(1,3);
INSERT INTO blogger_follower(blogger_id, follower_id)
VALUES(1,4);

INSERT INTO blogger_follower(blogger_id, follower_id)
VALUES(2,1);
INSERT INTO blogger_follower(blogger_id, follower_id)
VALUES(2,3);

INSERT INTO blogger_follower(blogger_id, follower_id)
VALUES(3,1);

INSERT INTO blogger_follower(blogger_id, follower_id)
VALUES(3,2);

INSERT INTO blogger_follower(blogger_id, follower_id)
VALUES(4,1);


SELECT *
FROM blogger_profile bp INNER JOIN (
    SELECT bf.blogger_id
    FROM blogger_follower bf
    WHERE bf.follower_id = 1
) f ON bp.blogger_id = f.blogger_id;

















