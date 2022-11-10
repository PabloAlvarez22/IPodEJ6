/**
 * @author pablo
 *
 */
public class IPodJJ   implements IIpod_simulator {
    private CancionJJ[] allSongs;
    private CancionJJ[] favSongs;
    private int actualIndexSong;
    private float volume;
    private boolean isOn;
    private boolean isLocked;
    public IPodJJ () throws Exception {
        actualIndexSong = 0;
        volume = 5;
        isOn = false;
        isLocked = true;
        allSongs = new CancionJJ[50];
        favSongs = new CancionJJ[10];
        setUpSongs();
    }
    private void setUpSongs() throws Exception {
        addSongToList("All Falls Down", "Alan Walker", "All Falls down", "3:19",0);
        addSongToList("Me, Myself & I", "Oliver tree", "Ugly is beautiful", "2:53",1);
        addSongToList("1993", "Oliver tree", "Ugly is beautiful", "2:39",2);
        addSongToList("Cash Machine", "Oliver tree","Ugly is beautiful","2:56",  3);
        addSongToList("Let me down", "Oliver tree","Ugly is beautiful","1:51",  4);
        addSongToList("Miracle man", "Oliver tree","Ugly is beautiful","2:05",  5);
        addSongToList("Alien boy", "Oliver tree","Ugly is beautiful","2:44",  6);
        addSongToList("Jokes On you", "Oliver tree","Ugly is beautiful","3:11",  7);
        addSongToList("Again & Again", "Oliver tree","Ugly is beautiful","2:54",  8);
        addSongToList("Waste my time", "Oliver tree","Ugly is beautiful","3:27",  9);
        addSongToList("Jerk", "Oliver tree","Ugly is beautiful","2:15",  10);
        addSongToList("Hurt", "Oliver tree","Ugly is beautiful","2:25",  11);
        addSongToList("Introspective", "Oliver tree","Ugly is beautiful","2:16",  12);
        addSongToList("Im gone", "Oliver tree","Ugly is beautiful","3:05",  13);
        addSongToList("LA PRIMERA", "Dillom","POST MORTEM","3:19",  49);
        addSongToList("HEGEMONICA", "Dillom","POST MORTEM","1:46",  49);
        addSongToList("PELOTUDA", "Dillom","POST MORTEM","3:05",  49);
        addSongToList("DEMIAN", "Dillom","POST MORTEM","1:52",  49);
        addSongToList("POST MORTEMs", "Dillom","POST MORTEM","2:39",  49);
        addSongToList("BICICLETA", "Dillom","POST MORTEM","3:27",  49);
        addSongToList("DUO", "Dillom","POST MORTEM","0:42",  49);
        addSongToList("PISO 13", "Dillom","POST MORTEM","1:59",  49);
        addSongToList("SIDE", "Dillom","POST MORTEM","3:11",  49);
        addSongToList("COACH", "Dillom","2:57", "", 49);
        addSongToList("BOHEMIAN GROOVE SKIT", "Dillom","POST MORTEM","1:00",  49);
        addSongToList("OPA", "Dillom","POST MORTEM","2:49",  49);
        addSongToList("RILI RILI", "Dillom","POST MORTEM","2:19",  49);
        addSongToList("220", "Dillom","POST MORTEM","2:56",  49);
        addSongToList("TODA LA GENTE", "Dillom","POST MORTEM","1:56",  49);
        addSongToList("REALITY", "Dillom","POST MORTEM","2:11",  49);
        addSongToList("ROCKETPOWERS", "Dillom","POST MORTEM","3:08",  49);
        addSongToList("AMIGOS NUEVOS", "Dillom","POST MORTEM","2:19",  49);
        addSongToList("Si veo tu mama", "Bad bunny","2:50", "", 49);
        addSongToList("La dificil", "Bad bunny","YHLQMDLG","2:43",  49);
        addSongToList("Pero ya no", "Bad bunny","YHLQMDLG","2:40",  49);
        addSongToList("La santa", "Bad bunny","YHLQMDLG","3:26",  49);
        addSongToList("Yo perreo sola", "Bad bunny","YHLQMDLG","2:52",  49);
        addSongToList("Bichiyal", "Bad bunny","YHLQMDLG","3:16",  49);
        addSongToList("Solia", "Bad bunny","YHLQMDLG","2:39",  49);
        addSongToList("La zona", "Bad bunny","YHLQMDLG","2:16",  49);
        addSongToList("Que malo", "Bad bunny","YHLQMDLG","2:47",  49);
        addSongToList("Vete", "Bad bunny","YHLQMDLG","3:12",  49);
        addSongToList("Ignorantes", "Bad bunny","YHLQMDLG","3:30",  49);
        addSongToList("A tu merced", "Bad bunny","YHLQMDLG","2:55",  49);
        addSongToList("Una vez", "Bad bunny","YHLQMDLG","3:52",  49);
        addSongToList("Safaera", "Bad bunny","YHLQMDLG","4:55",  49);
        addSongToList("25/8", "Bad bunny","YHLQMDLG","4:03",  49);
        addSongToList("Esta cabron ser yo", "Bad bunny","YHLQMDLG","3:47",  49);
        addSongToList("Puesto pa guerrial", "Bad bunny","YHLQMDLG","3:10",  49);
        addSongToList("P FKN R", "Bad bunny","YHLQMDLG","4:18",  49);
        addSongToList("Hablamos mañana", "Bad bunny","YHLQMDLG","4:00",  49);
    }

    private String watchFavourites() {
        String cad = "\nFavoritas:\n";
        for(int i = 1; i <= 10; i = i + 1)
        {
            cad += i+". "+favSongs[i-1]+"\n";
        }
        return cad;
    }
    @Override
    public boolean SwitchONOFF(boolean actual_state) {
        isOn = !actual_state;
        System.out.println(isOn?"Ipod: Encendido":"Ipod: Apagado");
        return isOn;
    }

    @Override
    public boolean LockUnlockDevice(boolean actual_locked_state) {
        if (isOn) {
            isLocked = !actual_locked_state;
        }else System.out.println("Debe estar encendido para usar boton de bloqueo");
        System.out.println(isLocked?"Ipod: Bloqueado":"Ipod: Desbloqueado");
        return isLocked;
    }

    @Override
    public float getVolume() {
        return volume;
    }

    @Override
    public float setVolume(float volume) {
        if (isOn)
        {
            if(!isLocked) {
                if (volume <= 10 && volume >= 0) this.volume = volume;
                else System.out.println("Volumen fuera de rango");
            }else System.out.println("Debe estar desbloqueado para controlar volumen");
        }else System.out.println("Debe estar encendido para poder usar el control de volumen");
        return this.volume;
    }

    @Override
    public int Prev(int actual_index) {
        if (isOn){
            if (!isLocked) {
                actualIndexSong = (actualIndexSong - 1)%50;
                if(actualIndexSong<0) actualIndexSong = actualIndexSong+50;
            }else System.out.println("Debe estar desbloqueado para cambiar de cancion");
        }else System.out.println("Debe estar encendido para poder cambiar de cancion");
        return actualIndexSong;
    }

    @Override
    public int Next(int actual_index) {
        if (isOn){
            if (!isLocked) {
                actualIndexSong = (actualIndexSong + 1)%50;
            }else System.out.println("Debe estar desbloqueado para cambiar de cancion");
        }else System.out.println("Debe estar encendido para poder cambiar de cancion");
        System.out.println(actualIndexSong);
        return actualIndexSong;
    }

    @Override
    public int getActualIndex() {
        return actualIndexSong;
    }

    @Override
    public void setActualIndex(int actual_index) throws Exception {
        if (!(actual_index<=49) || !(actual_index>=0))
        {
            System.out.println("Indice fuera del rango");
            return;
        }
        if(allSongs[actual_index]==null)
        {
            System.out.println("Indice fuera del rango");
            return;
        }
        actualIndexSong = actual_index;
    }

    @Override
    public void addToFavorite(ICancion _song) throws Exception {
        if(!isOn)
        {
            System.out.println("El IPod debe estar encendido");
            return;
        }
        if(isLocked)
        {
            System.out.println("El IPod debe estar desbloqueado");
            return;
        }
        int i = 0;
        boolean space_found = false;
        while (i<favSongs.length && !space_found)
        {
            if(favSongs[i]==_song)
            {
                System.out.println("Cancion ya es parte de las favoritas");
                return;
            }
            if(favSongs[i]==null) space_found = true;

            else i++;
        }
        if(!space_found)
        {
            i -= 1;
            System.out.println("No hay espacio suficiente, colocando en el puesto 10, eliminando la anterior");
        }
        favSongs[i] = (CancionJJ) _song;
        System.out.println("Cancion añadida en el ultimo espacio disponible: "+i);

    }

    @Override
    public ICancion selectSpecificSong(int index) throws Exception {
        if(!isOn)
        {
            System.out.println("El IPod debe estar encendido");
            return null;
        }
        if(!isValidIndex(index)) return null;
        actualIndexSong = index;
        return allSongs[index];
    }

    @Override
    public ICancion selectSpecificFavoriteSong(int index) throws Exception {
        if(!isOn)
        {
            System.out.println("El IPod debe estar encendido");
            return null;
        }
        if(isLocked)
        {
            System.out.println("El IPod debe estar desbloqueado");
            return null;
        }
        index -= 1;
        if(!(index>=0) || !(index<=9)){
            System.out.println("Indice fuera de rango (debe ser del 1 al 10)");
            return null;
        }
        if (favSongs[index]==null)
        {
            System.out.println("La posicion favorita indicada esta vacia");
            return null;
        }
        CancionJJ canc = favSongs[index];
        boolean found_ind = false;
        int i = 0;
        while (allSongs.length>i && !found_ind)
        {
            if(allSongs[i]==canc) found_ind = true;
            else i++;
        }
        if (!found_ind)
        {
            System.out.println("Cancion no encontrada en directorio general");
            return null;
        }
        actualIndexSong = i;
        return allSongs[i];
    }

    @Override
    public ICancion[] getAllSongs() {
        return allSongs;
    }

    @Override
    public String getStatus(boolean _isON, boolean _isLocked, boolean _isPlaying, ICancion _actualSong) {
        if(!isOn)
        {
            System.out.println("El IPod debe estar encendido");
            return null;
        }
        CancionJJ currentSong = allSongs[actualIndexSong];
        return "Power: "+(isOn?"Encendido":"Apagado")+"\n" +
                "Seguridad: "+(isLocked?"Bloqueado":"Desbloqueado")+"\n"+
                "Volumen: "+volume+"\n"+
                "Reproduciendo: "+allSongs[actualIndexSong]+"\n"+
                watchFavourites();
    }

    @Override
    public boolean isValidIndex(int index) {
        if(!(index>=0) || !(index<=49)){
            System.out.println("Indice fuera de rango");
            return false;
        }
        if(allSongs[index]==null)
        {
            System.out.println("En el espacio indicado no hay una cancion");
            return false;
        }
        return true;
    }

    @Override
    public void addSongToList(String _titulo, String _artista, String _album, String _duracion, int _id) throws Exception {
        int i = 0;
        boolean space_found = false;
        while (i<allSongs.length && !space_found)
        {
            if(allSongs[i]==null) space_found = true;
            else i++;
        }
        if(!space_found)
        {
            i -= 1;
        }
        allSongs[i] = new CancionJJ(_titulo, _artista, _duracion, _album, i);
    }

    @Override
    public void deleteSongFromList(int index) throws Exception {
        if(!isOn)
        {
            System.out.println("El IPod debe estar encendido");
            return;
        }
        if(isLocked)
        {
            System.out.println("El IPod debe estar desbloqueado");
            return;
        }
        if(isValidIndex(index)){
            System.out.println("No hay cancion en esta posicion");
            return;
        }
        if((index>=0) && (index<=49)) allSongs[index] = null;
    }

    @Override
    public void deleteSongFromTop10(int index) throws Exception {
        if(!isOn)
        {
            System.out.println("El IPod debe estar encendido");
            return;
        }
        if(isLocked)
        {
            System.out.println("El IPod debe estar desbloqueado");
            return;
        }
        if(!(index>=0) || !(index<=9)){
            System.out.println("Indice fuera de rango");
            return;
        }
        favSongs[index] = null;
    }
}
