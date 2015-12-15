/*
 * Minio Java Library for Amazon S3 Compatible Cloud Storage, (C) 2015 Minio, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.minio.messages;

import com.google.api.client.util.Key;

@SuppressWarnings("unused")
public class Upload extends XmlEntity {
  @Key("Key")
  private String objectName;
  @Key("UploadId")
  private String uploadId;
  @Key("Initiator")
  private Initiator initiator;
  @Key("Owner")
  private Owner owner;
  @Key("StorageClass")
  private String storageClass;
  @Key("Initiated")
  private String initiated;

  public Upload() {
    super();
    super.name = "Upload";
  }


  public String getObjectName() {
    return objectName;
  }


  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }


  // must be there for XML parsing
  public void setKey(String objectName) {
    setObjectName(objectName);
  }


  public String getUploadId() {
    return uploadId;
  }

  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }

  public Initiator getInitiator() {
    return initiator;
  }

  public void setInitiator(Initiator initiator) {
    this.initiator = initiator;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public String getStorageClass() {
    return storageClass;
  }

  public void setStorageClass(String storageClass) {
    this.storageClass = storageClass;
  }

  public String getInitiated() {
    return initiated;
  }

  public void setInitiated(String initiated) {
    this.initiated = initiated;
  }
}
