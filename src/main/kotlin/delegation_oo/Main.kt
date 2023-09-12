package delegation_oo

class FileDownloader(private val file: String) : Downloader {
    override fun download() {
        println("$file doenloaded")
    }
}

class FilePlayer(private val file: String) : Player {
    override fun play() {
        println("$file playing")
    }
}

/*class MediaFile(
    private val downloader: Downloader,
    private val player: Player
) : Downloader, Player {

    override fun download() {
        downloader.download()
    }

    override fun play() {
        player.play()
    }
}*/

class MediaFile(
    private val downloader: Downloader,
    private val player: Player
) : Downloader by downloader, Player by player

class DolarConverte() : Converter {
    override fun converte(value: Double): Double {
        return value * 2.00
    }
}

class EuroConverte() : Converter {
    override fun converte(value: Double): Double {
        return value * 3.66
    }
}

fun main() {
    val file: String = "File.mp4"
    val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
    mediaFile.download()
    mediaFile.play()

    println("===== Exemplo 2=====")

    val account = Account()
    account.balance = 12.00


    println(account.converter(EuroConverte()))
    println(account.converter(DolarConverte()))
}