package me.brycecampbell.wlitem

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.net.URI

// Serializer code imported from the following address on Nov. 14, 2026.
object URISerializer: KSerializer<URI> {
    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("URI") {}

    override fun serialize(encoder: Encoder, value: URI) {
        encoder.encodeString(value.toString())
    }

    override fun deserialize(decoder: Decoder): URI {
        return URI(decoder.decodeString())
    }
}