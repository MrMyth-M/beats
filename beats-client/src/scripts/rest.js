const BASE_URL = "http://localhost:8080/api"

const SONGS_ALL = "/song/all"


export async function getAllAlbums() {
    const response = await fetch(BASE_URL + SONGS_ALL)
    const json = await response.json()
    return json
}