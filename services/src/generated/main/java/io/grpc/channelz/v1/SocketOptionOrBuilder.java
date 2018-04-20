// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/channelz.proto

package io.grpc.channelz.v1;

public interface SocketOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.SocketOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The human readable value of this socket option.  At least one of value or
   * additional will be set.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  java.lang.String getValue();
  /**
   * <pre>
   * The human readable value of this socket option.  At least one of value or
   * additional will be set.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * Additional data associated with the socket option.  At least one of value
   * or additional will be set.
   * </pre>
   *
   * <code>.google.protobuf.Any additional = 3;</code>
   */
  boolean hasAdditional();
  /**
   * <pre>
   * Additional data associated with the socket option.  At least one of value
   * or additional will be set.
   * </pre>
   *
   * <code>.google.protobuf.Any additional = 3;</code>
   */
  com.google.protobuf.Any getAdditional();
  /**
   * <pre>
   * Additional data associated with the socket option.  At least one of value
   * or additional will be set.
   * </pre>
   *
   * <code>.google.protobuf.Any additional = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getAdditionalOrBuilder();
}
