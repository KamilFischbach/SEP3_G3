// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rating.proto

package sep3.g3.rightoversjava.grpc.generated;

/**
 * Protobuf type {@code sep3.g3.RatingMessageList}
 */
public final class RatingMessageList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sep3.g3.RatingMessageList)
    RatingMessageListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RatingMessageList.newBuilder() to construct.
  private RatingMessageList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RatingMessageList() {
    ratings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RatingMessageList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RatingMessageList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ratings_ = new java.util.ArrayList<sep3.g3.rightoversjava.grpc.generated.RatingMessage>();
              mutable_bitField0_ |= 0x00000001;
            }
            ratings_.add(
                input.readMessage(sep3.g3.rightoversjava.grpc.generated.RatingMessage.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        ratings_ = java.util.Collections.unmodifiableList(ratings_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sep3.g3.rightoversjava.grpc.generated.Rating.internal_static_sep3_g3_RatingMessageList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sep3.g3.rightoversjava.grpc.generated.Rating.internal_static_sep3_g3_RatingMessageList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sep3.g3.rightoversjava.grpc.generated.RatingMessageList.class, sep3.g3.rightoversjava.grpc.generated.RatingMessageList.Builder.class);
  }

  public static final int RATINGS_FIELD_NUMBER = 1;
  private java.util.List<sep3.g3.rightoversjava.grpc.generated.RatingMessage> ratings_;
  /**
   * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<sep3.g3.rightoversjava.grpc.generated.RatingMessage> getRatingsList() {
    return ratings_;
  }
  /**
   * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends sep3.g3.rightoversjava.grpc.generated.RatingMessageOrBuilder> 
      getRatingsOrBuilderList() {
    return ratings_;
  }
  /**
   * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
   */
  @java.lang.Override
  public int getRatingsCount() {
    return ratings_.size();
  }
  /**
   * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
   */
  @java.lang.Override
  public sep3.g3.rightoversjava.grpc.generated.RatingMessage getRatings(int index) {
    return ratings_.get(index);
  }
  /**
   * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
   */
  @java.lang.Override
  public sep3.g3.rightoversjava.grpc.generated.RatingMessageOrBuilder getRatingsOrBuilder(
      int index) {
    return ratings_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < ratings_.size(); i++) {
      output.writeMessage(1, ratings_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ratings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ratings_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sep3.g3.rightoversjava.grpc.generated.RatingMessageList)) {
      return super.equals(obj);
    }
    sep3.g3.rightoversjava.grpc.generated.RatingMessageList other = (sep3.g3.rightoversjava.grpc.generated.RatingMessageList) obj;

    if (!getRatingsList()
        .equals(other.getRatingsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRatingsCount() > 0) {
      hash = (37 * hash) + RATINGS_FIELD_NUMBER;
      hash = (53 * hash) + getRatingsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sep3.g3.rightoversjava.grpc.generated.RatingMessageList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code sep3.g3.RatingMessageList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sep3.g3.RatingMessageList)
      sep3.g3.rightoversjava.grpc.generated.RatingMessageListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sep3.g3.rightoversjava.grpc.generated.Rating.internal_static_sep3_g3_RatingMessageList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sep3.g3.rightoversjava.grpc.generated.Rating.internal_static_sep3_g3_RatingMessageList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sep3.g3.rightoversjava.grpc.generated.RatingMessageList.class, sep3.g3.rightoversjava.grpc.generated.RatingMessageList.Builder.class);
    }

    // Construct using sep3.g3.rightoversjava.grpc.generated.RatingMessageList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getRatingsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ratingsBuilder_ == null) {
        ratings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ratingsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sep3.g3.rightoversjava.grpc.generated.Rating.internal_static_sep3_g3_RatingMessageList_descriptor;
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.RatingMessageList getDefaultInstanceForType() {
      return sep3.g3.rightoversjava.grpc.generated.RatingMessageList.getDefaultInstance();
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.RatingMessageList build() {
      sep3.g3.rightoversjava.grpc.generated.RatingMessageList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.RatingMessageList buildPartial() {
      sep3.g3.rightoversjava.grpc.generated.RatingMessageList result = new sep3.g3.rightoversjava.grpc.generated.RatingMessageList(this);
      int from_bitField0_ = bitField0_;
      if (ratingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ratings_ = java.util.Collections.unmodifiableList(ratings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ratings_ = ratings_;
      } else {
        result.ratings_ = ratingsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sep3.g3.rightoversjava.grpc.generated.RatingMessageList) {
        return mergeFrom((sep3.g3.rightoversjava.grpc.generated.RatingMessageList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sep3.g3.rightoversjava.grpc.generated.RatingMessageList other) {
      if (other == sep3.g3.rightoversjava.grpc.generated.RatingMessageList.getDefaultInstance()) return this;
      if (ratingsBuilder_ == null) {
        if (!other.ratings_.isEmpty()) {
          if (ratings_.isEmpty()) {
            ratings_ = other.ratings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRatingsIsMutable();
            ratings_.addAll(other.ratings_);
          }
          onChanged();
        }
      } else {
        if (!other.ratings_.isEmpty()) {
          if (ratingsBuilder_.isEmpty()) {
            ratingsBuilder_.dispose();
            ratingsBuilder_ = null;
            ratings_ = other.ratings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ratingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRatingsFieldBuilder() : null;
          } else {
            ratingsBuilder_.addAllMessages(other.ratings_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sep3.g3.rightoversjava.grpc.generated.RatingMessageList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sep3.g3.rightoversjava.grpc.generated.RatingMessageList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<sep3.g3.rightoversjava.grpc.generated.RatingMessage> ratings_ =
      java.util.Collections.emptyList();
    private void ensureRatingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ratings_ = new java.util.ArrayList<sep3.g3.rightoversjava.grpc.generated.RatingMessage>(ratings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        sep3.g3.rightoversjava.grpc.generated.RatingMessage, sep3.g3.rightoversjava.grpc.generated.RatingMessage.Builder, sep3.g3.rightoversjava.grpc.generated.RatingMessageOrBuilder> ratingsBuilder_;

    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public java.util.List<sep3.g3.rightoversjava.grpc.generated.RatingMessage> getRatingsList() {
      if (ratingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ratings_);
      } else {
        return ratingsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public int getRatingsCount() {
      if (ratingsBuilder_ == null) {
        return ratings_.size();
      } else {
        return ratingsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public sep3.g3.rightoversjava.grpc.generated.RatingMessage getRatings(int index) {
      if (ratingsBuilder_ == null) {
        return ratings_.get(index);
      } else {
        return ratingsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public Builder setRatings(
        int index, sep3.g3.rightoversjava.grpc.generated.RatingMessage value) {
      if (ratingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRatingsIsMutable();
        ratings_.set(index, value);
        onChanged();
      } else {
        ratingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public Builder setRatings(
        int index, sep3.g3.rightoversjava.grpc.generated.RatingMessage.Builder builderForValue) {
      if (ratingsBuilder_ == null) {
        ensureRatingsIsMutable();
        ratings_.set(index, builderForValue.build());
        onChanged();
      } else {
        ratingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public Builder addRatings(sep3.g3.rightoversjava.grpc.generated.RatingMessage value) {
      if (ratingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRatingsIsMutable();
        ratings_.add(value);
        onChanged();
      } else {
        ratingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public Builder addRatings(
        int index, sep3.g3.rightoversjava.grpc.generated.RatingMessage value) {
      if (ratingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRatingsIsMutable();
        ratings_.add(index, value);
        onChanged();
      } else {
        ratingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public Builder addRatings(
        sep3.g3.rightoversjava.grpc.generated.RatingMessage.Builder builderForValue) {
      if (ratingsBuilder_ == null) {
        ensureRatingsIsMutable();
        ratings_.add(builderForValue.build());
        onChanged();
      } else {
        ratingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public Builder addRatings(
        int index, sep3.g3.rightoversjava.grpc.generated.RatingMessage.Builder builderForValue) {
      if (ratingsBuilder_ == null) {
        ensureRatingsIsMutable();
        ratings_.add(index, builderForValue.build());
        onChanged();
      } else {
        ratingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public Builder addAllRatings(
        java.lang.Iterable<? extends sep3.g3.rightoversjava.grpc.generated.RatingMessage> values) {
      if (ratingsBuilder_ == null) {
        ensureRatingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ratings_);
        onChanged();
      } else {
        ratingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public Builder clearRatings() {
      if (ratingsBuilder_ == null) {
        ratings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ratingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public Builder removeRatings(int index) {
      if (ratingsBuilder_ == null) {
        ensureRatingsIsMutable();
        ratings_.remove(index);
        onChanged();
      } else {
        ratingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public sep3.g3.rightoversjava.grpc.generated.RatingMessage.Builder getRatingsBuilder(
        int index) {
      return getRatingsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public sep3.g3.rightoversjava.grpc.generated.RatingMessageOrBuilder getRatingsOrBuilder(
        int index) {
      if (ratingsBuilder_ == null) {
        return ratings_.get(index);  } else {
        return ratingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public java.util.List<? extends sep3.g3.rightoversjava.grpc.generated.RatingMessageOrBuilder> 
         getRatingsOrBuilderList() {
      if (ratingsBuilder_ != null) {
        return ratingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ratings_);
      }
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public sep3.g3.rightoversjava.grpc.generated.RatingMessage.Builder addRatingsBuilder() {
      return getRatingsFieldBuilder().addBuilder(
          sep3.g3.rightoversjava.grpc.generated.RatingMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public sep3.g3.rightoversjava.grpc.generated.RatingMessage.Builder addRatingsBuilder(
        int index) {
      return getRatingsFieldBuilder().addBuilder(
          index, sep3.g3.rightoversjava.grpc.generated.RatingMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .sep3.g3.RatingMessage ratings = 1;</code>
     */
    public java.util.List<sep3.g3.rightoversjava.grpc.generated.RatingMessage.Builder> 
         getRatingsBuilderList() {
      return getRatingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        sep3.g3.rightoversjava.grpc.generated.RatingMessage, sep3.g3.rightoversjava.grpc.generated.RatingMessage.Builder, sep3.g3.rightoversjava.grpc.generated.RatingMessageOrBuilder> 
        getRatingsFieldBuilder() {
      if (ratingsBuilder_ == null) {
        ratingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            sep3.g3.rightoversjava.grpc.generated.RatingMessage, sep3.g3.rightoversjava.grpc.generated.RatingMessage.Builder, sep3.g3.rightoversjava.grpc.generated.RatingMessageOrBuilder>(
                ratings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ratings_ = null;
      }
      return ratingsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sep3.g3.RatingMessageList)
  }

  // @@protoc_insertion_point(class_scope:sep3.g3.RatingMessageList)
  private static final sep3.g3.rightoversjava.grpc.generated.RatingMessageList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sep3.g3.rightoversjava.grpc.generated.RatingMessageList();
  }

  public static sep3.g3.rightoversjava.grpc.generated.RatingMessageList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RatingMessageList>
      PARSER = new com.google.protobuf.AbstractParser<RatingMessageList>() {
    @java.lang.Override
    public RatingMessageList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RatingMessageList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RatingMessageList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RatingMessageList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sep3.g3.rightoversjava.grpc.generated.RatingMessageList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

