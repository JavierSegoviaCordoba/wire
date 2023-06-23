// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.wire.buildersonly.SomeMessage in squareup/wire/some_message.proto
package squareup.wire.buildersonly

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmField
import okio.ByteString

public class SomeMessage internal constructor(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
  )
  @JvmField
  public val opt_int32: Int? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SomeMessage, SomeMessage.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.opt_int32 = opt_int32
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SomeMessage) return false
    if (unknownFields != other.unknownFields) return false
    if (opt_int32 != other.opt_int32) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (opt_int32?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (opt_int32 != null) result += """opt_int32=$opt_int32"""
    return result.joinToString(prefix = "SomeMessage{", separator = ", ", postfix = "}")
  }

  public fun copy(opt_int32: Int? = this.opt_int32, unknownFields: ByteString = this.unknownFields):
      SomeMessage = SomeMessage(opt_int32, unknownFields)

  public class Builder : Message.Builder<SomeMessage, Builder>() {
    @JvmField
    public var opt_int32: Int? = null

    public fun opt_int32(opt_int32: Int?): Builder {
      this.opt_int32 = opt_int32
      return this
    }

    override fun build(): SomeMessage = SomeMessage(
      opt_int32 = opt_int32,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SomeMessage> = object : ProtoAdapter<SomeMessage>(
      FieldEncoding.LENGTH_DELIMITED, 
      SomeMessage::class, 
      "type.googleapis.com/squareup.wire.buildersonly.SomeMessage", 
      PROTO_2, 
      null, 
      "squareup/wire/some_message.proto"
    ) {
      override fun encodedSize(`value`: SomeMessage): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.opt_int32)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: SomeMessage) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.opt_int32)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: SomeMessage) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.opt_int32)
      }

      override fun decode(reader: ProtoReader): SomeMessage {
        var opt_int32: Int? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> opt_int32 = ProtoAdapter.INT32.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return SomeMessage(
          opt_int32 = opt_int32,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: SomeMessage): SomeMessage = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }

  public class NestedMessage internal constructor(
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
    )
    @JvmField
    public val a: Int? = null,
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<NestedMessage, NestedMessage.Builder>(ADAPTER, unknownFields) {
    override fun newBuilder(): Builder {
      val builder = Builder()
      builder.a = a
      builder.addUnknownFields(unknownFields)
      return builder
    }

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is NestedMessage) return false
      if (unknownFields != other.unknownFields) return false
      if (a != other.a) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + (a?.hashCode() ?: 0)
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      if (a != null) result += """a=$a"""
      return result.joinToString(prefix = "NestedMessage{", separator = ", ", postfix = "}")
    }

    public fun copy(a: Int? = this.a, unknownFields: ByteString = this.unknownFields): NestedMessage
        = NestedMessage(a, unknownFields)

    public class Builder : Message.Builder<NestedMessage, Builder>() {
      @JvmField
      public var a: Int? = null

      public fun a(a: Int?): Builder {
        this.a = a
        return this
      }

      override fun build(): NestedMessage = NestedMessage(
        a = a,
        unknownFields = buildUnknownFields()
      )
    }

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<NestedMessage> = object : ProtoAdapter<NestedMessage>(
        FieldEncoding.LENGTH_DELIMITED, 
        NestedMessage::class, 
        "type.googleapis.com/squareup.wire.buildersonly.SomeMessage.NestedMessage", 
        PROTO_2, 
        null, 
        "squareup/wire/some_message.proto"
      ) {
        override fun encodedSize(`value`: NestedMessage): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.a)
          return size
        }

        override fun encode(writer: ProtoWriter, `value`: NestedMessage) {
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.a)
          writer.writeBytes(value.unknownFields)
        }

        override fun encode(writer: ReverseProtoWriter, `value`: NestedMessage) {
          writer.writeBytes(value.unknownFields)
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.a)
        }

        override fun decode(reader: ProtoReader): NestedMessage {
          var a: Int? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> a = ProtoAdapter.INT32.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return NestedMessage(
            a = a,
            unknownFields = unknownFields
          )
        }

        override fun redact(`value`: NestedMessage): NestedMessage = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }
}
