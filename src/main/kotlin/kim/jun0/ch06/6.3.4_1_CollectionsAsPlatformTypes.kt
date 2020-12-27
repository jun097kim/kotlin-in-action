package kim.jun0.ch06.collections_as_platform_types

import kim.jun0.ch06.FileContentProcessor
import java.io.File

class FileIndexer : FileContentProcessor {
    override fun processContents(path: File?, binaryContents: ByteArray?, textContents: List<String>?) {
        // ...
    }
}