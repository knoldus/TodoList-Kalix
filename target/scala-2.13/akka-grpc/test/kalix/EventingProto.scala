// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package kalix

object EventingProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      kalix.Eventing,
      kalix.EventSource,
      kalix.EventDestination
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChRrYWxpeC9ldmVudGluZy5wcm90bxIFa2FsaXgaIGdvb2dsZS9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvImwKCEV2ZW50a
  W5nEisKAmluGAEgASgLMhIua2FsaXguRXZlbnRTb3VyY2VCB+I/BBICaW5SAmluEjMKA291dBgCIAEoCzIXLmthbGl4LkV2ZW50R
  GVzdGluYXRpb25CCOI/BRIDb3V0UgNvdXQi+gEKC0V2ZW50U291cmNlEjkKDmNvbnN1bWVyX2dyb3VwGAEgASgJQhLiPw8SDWNvb
  nN1bWVyR3JvdXBSDWNvbnN1bWVyR3JvdXASIgoFdG9waWMYAiABKAlCCuI/BxIFdG9waWNIAFIFdG9waWMSSwoUZXZlbnRfc291c
  mNlZF9lbnRpdHkYAyABKAlCF+I/FBISZXZlbnRTb3VyY2VkRW50aXR5SABSEmV2ZW50U291cmNlZEVudGl0eRI1Cgx2YWx1ZV9lb
  nRpdHkYBCABKAlCEOI/DRILdmFsdWVFbnRpdHlIAFILdmFsdWVFbnRpdHlCCAoGc291cmNlIkUKEEV2ZW50RGVzdGluYXRpb24SI
  goFdG9waWMYASABKAlCCuI/BxIFdG9waWNIAFIFdG9waWNCDQoLZGVzdGluYXRpb25CRQoFa2FsaXhCC0V2ZW50c1Byb3RvUAFaL
  WdpdGh1Yi5jb20vbGlnaHRiZW5kL2thbGl4LWdvLXNkay9rYWxpeDtrYWxpeGIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}