// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodPost.proto

package sep3.g3.rightoversjava.grpc.generated;

public interface ReportMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sep3.g3.ReportMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 post_id = 1;</code>
   * @return The postId.
   */
  int getPostId();

  /**
   * <code>string comment = 2;</code>
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   * <code>string comment = 2;</code>
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString
      getCommentBytes();

  /**
   * <code>string username_reporting = 3;</code>
   * @return The usernameReporting.
   */
  java.lang.String getUsernameReporting();
  /**
   * <code>string username_reporting = 3;</code>
   * @return The bytes for usernameReporting.
   */
  com.google.protobuf.ByteString
      getUsernameReportingBytes();

  /**
   * <code>int32 report_id = 4;</code>
   * @return The reportId.
   */
  int getReportId();
}
