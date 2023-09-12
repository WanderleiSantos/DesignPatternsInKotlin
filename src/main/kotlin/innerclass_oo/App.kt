package innerclass_oo

class App: DownloadListener {
    override fun onDownloadStarted() {
        println("Donwload Started")
    }

    override fun onDownloadCompleted(file: String) {
        println("Download Completed $file")
    }

    override fun onProgressUpdate(progress: Int) {
        println("$progress% Downloaded")
    }
}

fun main(args: Array<String>) {
    val downloadListener = App()
    val downloader = Downloader()
    downloader.downloadListener = downloadListener

/*    downloader.downloadListener = object : DownloadListener {
        override fun onDownloadStarted() {
            println("Donwload Started")
        }

        override fun onDownloadCompleted(file: String) {
            println("Download Completed $file")
        }

        override fun onProgressUpdate(progress: Int) {
            println("$progress% Downloaded")
        }
    }*/


    downloader.downloadFile("Teste.txt")
}