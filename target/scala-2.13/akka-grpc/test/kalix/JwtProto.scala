// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package kalix

object JwtProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      kalix.JwtFieldOptions,
      kalix.JwtMessageOptions,
      kalix.JwtMethodOptions
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Cg9rYWxpeC9qd3QucHJvdG8SBWthbGl4ItgECg9Kd3RGaWVsZE9wdGlvbnMSSAoFY2xhaW0YASABKA4yJi5rYWxpeC5Kd3RGa
  WVsZE9wdGlvbnMuSnd0Q2xhaW1JbmNsdWRlQgriPwcSBWNsYWltUgVjbGFpbRIdCgRuYW1lGAIgASgJQgniPwYSBG5hbWVSBG5hb
  WUSIAoFdG9rZW4YAyABKAhCCuI/BxIFdG9rZW5SBXRva2VuEkwKFWluY2x1ZGVfcGFyZW50X2NsYWltcxgEIAEoCEIY4j8VEhNpb
  mNsdWRlUGFyZW50Q2xhaW1zUhNpbmNsdWRlUGFyZW50Q2xhaW1zElkKGmluY2x1ZGVfYmVhcmVyX3Rva2VuX2NsYWltGAUgAygJQ
  hziPxkSF2luY2x1ZGVCZWFyZXJUb2tlbkNsYWltUhdpbmNsdWRlQmVhcmVyVG9rZW5DbGFpbRIjCgZpc3N1ZXIYBiADKAlCC+I/C
  BIGaXNzdWVyUgZpc3N1ZXISPAoPZXhwaXJlc19zZWNvbmRzGAcgASgDQhPiPxASDmV4cGlyZXNTZWNvbmRzUg5leHBpcmVzU2Vjb
  25kcyKtAQoPSnd0Q2xhaW1JbmNsdWRlEiEKC1VOU1BFQ0lGSUVEEAAaEOI/DRILVU5TUEVDSUZJRUQSGQoHSU5DTFVERRABGgziP
  wkSB0lOQ0xVREUSGQoHRVhUUkFDVBACGgziPwkSB0VYVFJBQ1QSGQoHREVTQ0VORBADGgziPwkSB0RFU0NFTkQSEwoETkVTVBAEG
  gniPwYSBE5FU1QSEQoDUkFXEAUaCOI/BRIDUkFXImEKEUp3dE1lc3NhZ2VPcHRpb25zEkwKFXZhbGlkYXRlX2JlYXJlcl90b2tlb
  hgBIAEoCEIY4j8VEhN2YWxpZGF0ZUJlYXJlclRva2VuUhN2YWxpZGF0ZUJlYXJlclRva2VuIuYCChBKd3RNZXRob2RPcHRpb25zE
  lAKCHZhbGlkYXRlGAEgAygOMiUua2FsaXguSnd0TWV0aG9kT3B0aW9ucy5Kd3RNZXRob2RNb2RlQg3iPwoSCHZhbGlkYXRlUgh2Y
  WxpZGF0ZRJECgRzaWduGAIgAygOMiUua2FsaXguSnd0TWV0aG9kT3B0aW9ucy5Kd3RNZXRob2RNb2RlQgniPwYSBHNpZ25SBHNpZ
  24SRgoTYmVhcmVyX3Rva2VuX2lzc3VlchgDIAMoCUIW4j8TEhFiZWFyZXJUb2tlbklzc3VlclIRYmVhcmVyVG9rZW5Jc3N1ZXIic
  goNSnd0TWV0aG9kTW9kZRIhCgtVTlNQRUNJRklFRBAAGhDiPw0SC1VOU1BFQ0lGSUVEEiMKDEJFQVJFUl9UT0tFThABGhHiPw4SD
  EJFQVJFUl9UT0tFThIZCgdNRVNTQUdFEAIaDOI/CRIHTUVTU0FHRUJCCgVrYWxpeEIISnd0UHJvdG9QAVotZ2l0aHViLmNvbS9sa
  WdodGJlbmQva2FsaXgtZ28tc2RrL2thbGl4O2thbGl4YgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}