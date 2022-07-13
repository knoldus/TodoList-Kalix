
// Generated by Akka gRPC. DO NOT EDIT.
package todolist.view

import akka.annotation.ApiMayChange

import akka.grpc.AkkaGrpcGenerated


@AkkaGrpcGenerated
trait TodoListByName {
  
  
  def updateTodoList(in: todolist.domain.TodoItemState): scala.concurrent.Future[todolist.domain.TodoItemState]
  
  
  def getTodoListItems(in: todolist.view.GetByNameRequest): akka.stream.scaladsl.Source[todolist.domain.TodoItemState, akka.NotUsed]
  
}



@AkkaGrpcGenerated
object TodoListByName extends akka.grpc.ServiceDescription {
  val name = "todolist.view.TodoListByName"

  val descriptor: com.google.protobuf.Descriptors.FileDescriptor =
    todolist.view.TodolistViewProto.javaDescriptor;

  object Serializers {
    import akka.grpc.scaladsl.ScalapbProtobufSerializer
    
    val TodoItemStateSerializer = new ScalapbProtobufSerializer(todolist.domain.TodoItemState.messageCompanion)
    
    val GetByNameRequestSerializer = new ScalapbProtobufSerializer(todolist.view.GetByNameRequest.messageCompanion)
    
  }

  @ApiMayChange
  @AkkaGrpcGenerated
  object MethodDescriptors {
    import akka.grpc.internal.Marshaller
    import io.grpc.MethodDescriptor
    import Serializers._

    
    val updateTodoListDescriptor: MethodDescriptor[todolist.domain.TodoItemState, todolist.domain.TodoItemState] =
      MethodDescriptor.newBuilder()
        .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("todolist.view.TodoListByName", "UpdateTodoList"))
        .setRequestMarshaller(new Marshaller(TodoItemStateSerializer))
        .setResponseMarshaller(new Marshaller(TodoItemStateSerializer))
        .setSampledToLocalTracing(true)
        .build()
    
    val getTodoListItemsDescriptor: MethodDescriptor[todolist.view.GetByNameRequest, todolist.domain.TodoItemState] =
      MethodDescriptor.newBuilder()
        .setType(
  
  
   MethodDescriptor.MethodType.SERVER_STREAMING 
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("todolist.view.TodoListByName", "GetTodoListItems"))
        .setRequestMarshaller(new Marshaller(GetByNameRequestSerializer))
        .setResponseMarshaller(new Marshaller(TodoItemStateSerializer))
        .setSampledToLocalTracing(true)
        .build()
    
  }
}