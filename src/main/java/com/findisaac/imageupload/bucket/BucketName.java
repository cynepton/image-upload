package com.findisaac.imageupload.bucket;

/**
 * Enum class for the S3 bucket name
 */
public enum BucketName {
    PROFILE_IMAGE("springboot-image-upload");

    /**
     * Private value, the bucket name
     */
    private final String bucketName;

    /**
     * Constructor method for the BucketName class
     * @param bucketName The bucket name
     */
    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Getter method for the Bucket Name
     * @return String bucketName
     */
    public String getBucketName() {
        return bucketName;
    }
}
