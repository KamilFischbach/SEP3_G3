// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodPost.proto

package sep3.g3.rightoversjava.grpc.generated;

public interface FoodPostResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sep3.g3.FoodPostResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 fp_id = 1;</code>
   * @return The fpId.
   */
  int getFpId();

  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string category_ = 3;</code>
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   * <code>string category_ = 3;</code>
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString
      getCategoryBytes();

  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string pictureUrl = 5;</code>
   * @return The pictureUrl.
   */
  java.lang.String getPictureUrl();
  /**
   * <code>string pictureUrl = 5;</code>
   * @return The bytes for pictureUrl.
   */
  com.google.protobuf.ByteString
      getPictureUrlBytes();

  /**
   * <code>int32 daysUntilExpired = 6;</code>
   * @return The daysUntilExpired.
   */
  int getDaysUntilExpired();

  /**
   * <code>string fp_state = 7;</code>
   * @return The fpState.
   */
  java.lang.String getFpState();
  /**
   * <code>string fp_state = 7;</code>
   * @return The bytes for fpState.
   */
  com.google.protobuf.ByteString
      getFpStateBytes();
}
