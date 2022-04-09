const BASE_URL = "http://localhost:8080/api"
// ALBUMS
const ALBUMS_ALL = "/album/all"

// SONGS 
const SONGS_ALL = "/song/all"
const SONGS_FROM_ALBUM = "/song/album/"


export async function getAll(URL) {
    const response = await fetch(BASE_URL + URL)
    const json = await response.json()
    return json
}

export async function getAllAlbums() {
    return await getAll(ALBUMS_ALL)
}

export async function getSongsFromAlbum(id) {
    return await getAll(SONGS_FROM_ALBUM + id)
}