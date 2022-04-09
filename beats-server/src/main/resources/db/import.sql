INSERT INTO beats.artist(id, name) VALUES(1, 'Glass Animals');
INSERT INTO beats.artist(id, name) VALUES(2, 'Fox Stevenson');
INSERT INTO beats.artist(id, name) VALUES(3, 'Ghostemane');
INSERT INTO beats.artist(id, name) VALUES(4, 'TUMAGGZ');
INSERT INTO beats.artist(id, name) VALUES(5, 'Denzel Curry');


INSERT INTO beats.album(id, coverUrl, name, artist_id) VALUES (1, 'http://localhost:3000/images/covers/albums/1.jpg', 'Dreamland', 1);
INSERT INTO beats.album(id, coverUrl, name, artist_id) VALUES (2, 'http://localhost:3000/images/covers/albums/2.jpg', 'As Above So Below', 4);
INSERT INTO beats.album(id, coverUrl, name, artist_id) VALUES (3, 'http://localhost:3000/images/covers/albums/3.jpg', 'Don`t Care Crown', 2);
INSERT INTO beats.album(id, coverUrl, name, artist_id) VALUES (4, 'http://localhost:3000/images/covers/albums/4.jpg', 'N/O/I/S/E', 3);
INSERT INTO beats.album(id, coverUrl, name, artist_id) VALUES (5, 'http://localhost:3000/images/covers/albums/5.jpg', 'How To Be A Human Being', 1);


INSERT INTO beats.song(id, coverUrl, name, album_id) VALUES (1, 'http://localhost:3000/images/covers/songs/1.jpg', 'Tokyo Drifting', 1);
INSERT INTO beats.song(id, coverUrl, name, album_id) VALUES (2, 'http://localhost:3000/images/covers/songs/1.jpg', 'Dreamland', 1);
INSERT INTO beats.song(id, coverUrl, name, album_id) VALUES (3, 'http://localhost:3000/images/covers/songs/1.jpg', 'Heat Waves', 1);
INSERT INTO beats.song(id, coverUrl, name, album_id) VALUES (4, 'http://localhost:3000/images/covers/songs/2.jpg', 'As Above So Below', 2);
INSERT INTO beats.song(id, coverUrl, name, album_id) VALUES (5, 'http://localhost:3000/images/covers/songs/3.jpg', 'Dont`t Care Crown', 3);
INSERT INTO beats.song(id, coverUrl, name, album_id) VALUES (6, 'http://localhost:3000/images/covers/songs/4.jpg', 'Flesh', 4);
INSERT INTO beats.song(id, coverUrl, name, album_id) VALUES (7, 'http://localhost:3000/images/covers/songs/4.jpg', 'Nihil', 4);
INSERT INTO beats.song(id, coverUrl, name, album_id) VALUES (8, 'http://localhost:3000/images/covers/songs/4.jpg', 'Bonesaw', 4);
INSERT INTO beats.song(id, coverUrl, name, album_id) VALUES (9, 'http://localhost:3000/images/covers/songs/5.jpg', 'Agnes', 5);
INSERT INTO beats.song(id, coverUrl, name, album_id) VALUES (10, 'http://localhost:3000/images/covers/songs/5.jpg', 'Season 2 Episode 3', 5);


INSERT INTO song_artist(Song_id, artists_id) VALUES (1, 1);
INSERT INTO song_artist(Song_id, artists_id) VALUES (1, 5);
INSERT INTO song_artist(Song_id, artists_id) VALUES (2, 1);
INSERT INTO song_artist(Song_id, artists_id) VALUES (3, 1);
INSERT INTO song_artist(Song_id, artists_id) VALUES (4, 4);
INSERT INTO song_artist(Song_id, artists_id) VALUES (5, 2);
INSERT INTO song_artist(Song_id, artists_id) VALUES (6, 3);
INSERT INTO song_artist(Song_id, artists_id) VALUES (7, 3);
INSERT INTO song_artist(Song_id, artists_id) VALUES (8, 3);
INSERT INTO song_artist(Song_id, artists_id) VALUES (9, 1);
INSERT INTO song_artist(Song_id, artists_id) VALUES (10, 1);
