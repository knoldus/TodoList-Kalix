// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package todolist.view

object TodolistViewProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    todolist.domain.TodolistDomainProto,
    kalix.AnnotationsProto,
    com.google.protobuf.any.AnyProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      todolist.view.GetByNameRequest
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CiF0b2RvbGlzdC92aWV3L3RvZG9saXN0X3ZpZXcucHJvdG8SDXRvZG9saXN0LnZpZXcaJXRvZG9saXN0L2RvbWFpbi90b2Rvb
  GlzdF9kb21haW4ucHJvdG8aF2thbGl4L2Fubm90YXRpb25zLnByb3RvGhlnb29nbGUvcHJvdG9idWYvYW55LnByb3RvIjEKEEdld
  EJ5TmFtZVJlcXVlc3QSHQoEbmFtZRgBIAEoCUIJ4j8GEgRuYW1lUgRuYW1lMp0CCg5Ub2RvTGlzdEJ5TmFtZRJ0Cg5VcGRhdGVUb
  2RvTGlzdBIeLnRvZG9saXN0LmRvbWFpbi5Ub2RvSXRlbVN0YXRlGh4udG9kb2xpc3QuZG9tYWluLlRvZG9JdGVtU3RhdGUiIsJDD
  goMCgoiCHRvZG9saXN0wkMOEgwKCgoIdG9kb2xpc3QSjQEKEEdldFRvZG9MaXN0SXRlbXMSHy50b2RvbGlzdC52aWV3LkdldEJ5T
  mFtZVJlcXVlc3QaHi50b2RvbGlzdC5kb21haW4uVG9kb0l0ZW1TdGF0ZSI2wkMzEjESLxotU0VMRUNUICogRlJPTSB0b2RvbGlzd
  CB3aGVyZSBhZGRlZF9ieSA9IDpuYW1lMAEaBcpDAioAYgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      todolist.domain.TodolistDomainProto.javaDescriptor,
      kalix.AnnotationsProto.javaDescriptor,
      com.google.protobuf.any.AnyProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}