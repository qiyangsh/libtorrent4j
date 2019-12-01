/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libtorrent4j.swig;

public class peer_info {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected peer_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPieces(piece_index_bitfield value) {
    libtorrent_jni.peer_info_pieces_set(swigCPtr, this, piece_index_bitfield.getCPtr(value), value);
  }

  public piece_index_bitfield getPieces() {
    long cPtr = libtorrent_jni.peer_info_pieces_get(swigCPtr, this);
    return (cPtr == 0) ? null : new piece_index_bitfield(cPtr, false);
  }

  public void setTotal_download(long value) {
    libtorrent_jni.peer_info_total_download_set(swigCPtr, this, value);
  }

  public long getTotal_download() {
    return libtorrent_jni.peer_info_total_download_get(swigCPtr, this);
  }

  public void setTotal_upload(long value) {
    libtorrent_jni.peer_info_total_upload_set(swigCPtr, this, value);
  }

  public long getTotal_upload() {
    return libtorrent_jni.peer_info_total_upload_get(swigCPtr, this);
  }

  public void setFlags(peer_flags_t value) {
    libtorrent_jni.peer_info_flags_set(swigCPtr, this, peer_flags_t.getCPtr(value), value);
  }

  public peer_flags_t getFlags() {
    long cPtr = libtorrent_jni.peer_info_flags_get(swigCPtr, this);
    return (cPtr == 0) ? null : new peer_flags_t(cPtr, false);
  }

  public void setSource(peer_source_flags_t value) {
    libtorrent_jni.peer_info_source_set(swigCPtr, this, peer_source_flags_t.getCPtr(value), value);
  }

  public peer_source_flags_t getSource() {
    long cPtr = libtorrent_jni.peer_info_source_get(swigCPtr, this);
    return (cPtr == 0) ? null : new peer_source_flags_t(cPtr, false);
  }

  public void setUp_speed(int value) {
    libtorrent_jni.peer_info_up_speed_set(swigCPtr, this, value);
  }

  public int getUp_speed() {
    return libtorrent_jni.peer_info_up_speed_get(swigCPtr, this);
  }

  public void setDown_speed(int value) {
    libtorrent_jni.peer_info_down_speed_set(swigCPtr, this, value);
  }

  public int getDown_speed() {
    return libtorrent_jni.peer_info_down_speed_get(swigCPtr, this);
  }

  public void setPayload_up_speed(int value) {
    libtorrent_jni.peer_info_payload_up_speed_set(swigCPtr, this, value);
  }

  public int getPayload_up_speed() {
    return libtorrent_jni.peer_info_payload_up_speed_get(swigCPtr, this);
  }

  public void setPayload_down_speed(int value) {
    libtorrent_jni.peer_info_payload_down_speed_set(swigCPtr, this, value);
  }

  public int getPayload_down_speed() {
    return libtorrent_jni.peer_info_payload_down_speed_get(swigCPtr, this);
  }

  public void setPid(sha1_hash value) {
    libtorrent_jni.peer_info_pid_set(swigCPtr, this, sha1_hash.getCPtr(value), value);
  }

  public sha1_hash getPid() {
    long cPtr = libtorrent_jni.peer_info_pid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public void setQueue_bytes(int value) {
    libtorrent_jni.peer_info_queue_bytes_set(swigCPtr, this, value);
  }

  public int getQueue_bytes() {
    return libtorrent_jni.peer_info_queue_bytes_get(swigCPtr, this);
  }

  public void setRequest_timeout(int value) {
    libtorrent_jni.peer_info_request_timeout_set(swigCPtr, this, value);
  }

  public int getRequest_timeout() {
    return libtorrent_jni.peer_info_request_timeout_get(swigCPtr, this);
  }

  public void setSend_buffer_size(int value) {
    libtorrent_jni.peer_info_send_buffer_size_set(swigCPtr, this, value);
  }

  public int getSend_buffer_size() {
    return libtorrent_jni.peer_info_send_buffer_size_get(swigCPtr, this);
  }

  public void setUsed_send_buffer(int value) {
    libtorrent_jni.peer_info_used_send_buffer_set(swigCPtr, this, value);
  }

  public int getUsed_send_buffer() {
    return libtorrent_jni.peer_info_used_send_buffer_get(swigCPtr, this);
  }

  public void setReceive_buffer_size(int value) {
    libtorrent_jni.peer_info_receive_buffer_size_set(swigCPtr, this, value);
  }

  public int getReceive_buffer_size() {
    return libtorrent_jni.peer_info_receive_buffer_size_get(swigCPtr, this);
  }

  public void setUsed_receive_buffer(int value) {
    libtorrent_jni.peer_info_used_receive_buffer_set(swigCPtr, this, value);
  }

  public int getUsed_receive_buffer() {
    return libtorrent_jni.peer_info_used_receive_buffer_get(swigCPtr, this);
  }

  public void setReceive_buffer_watermark(int value) {
    libtorrent_jni.peer_info_receive_buffer_watermark_set(swigCPtr, this, value);
  }

  public int getReceive_buffer_watermark() {
    return libtorrent_jni.peer_info_receive_buffer_watermark_get(swigCPtr, this);
  }

  public void setNum_hashfails(int value) {
    libtorrent_jni.peer_info_num_hashfails_set(swigCPtr, this, value);
  }

  public int getNum_hashfails() {
    return libtorrent_jni.peer_info_num_hashfails_get(swigCPtr, this);
  }

  public void setDownload_queue_length(int value) {
    libtorrent_jni.peer_info_download_queue_length_set(swigCPtr, this, value);
  }

  public int getDownload_queue_length() {
    return libtorrent_jni.peer_info_download_queue_length_get(swigCPtr, this);
  }

  public void setTimed_out_requests(int value) {
    libtorrent_jni.peer_info_timed_out_requests_set(swigCPtr, this, value);
  }

  public int getTimed_out_requests() {
    return libtorrent_jni.peer_info_timed_out_requests_get(swigCPtr, this);
  }

  public void setBusy_requests(int value) {
    libtorrent_jni.peer_info_busy_requests_set(swigCPtr, this, value);
  }

  public int getBusy_requests() {
    return libtorrent_jni.peer_info_busy_requests_get(swigCPtr, this);
  }

  public void setRequests_in_buffer(int value) {
    libtorrent_jni.peer_info_requests_in_buffer_set(swigCPtr, this, value);
  }

  public int getRequests_in_buffer() {
    return libtorrent_jni.peer_info_requests_in_buffer_get(swigCPtr, this);
  }

  public void setTarget_dl_queue_length(int value) {
    libtorrent_jni.peer_info_target_dl_queue_length_set(swigCPtr, this, value);
  }

  public int getTarget_dl_queue_length() {
    return libtorrent_jni.peer_info_target_dl_queue_length_get(swigCPtr, this);
  }

  public void setUpload_queue_length(int value) {
    libtorrent_jni.peer_info_upload_queue_length_set(swigCPtr, this, value);
  }

  public int getUpload_queue_length() {
    return libtorrent_jni.peer_info_upload_queue_length_get(swigCPtr, this);
  }

  public void setFailcount(int value) {
    libtorrent_jni.peer_info_failcount_set(swigCPtr, this, value);
  }

  public int getFailcount() {
    return libtorrent_jni.peer_info_failcount_get(swigCPtr, this);
  }

  public void setDownloading_piece_index(int value) {
    libtorrent_jni.peer_info_downloading_piece_index_set(swigCPtr, this, value);
  }

  public int getDownloading_piece_index() {
    return libtorrent_jni.peer_info_downloading_piece_index_get(swigCPtr, this);
  }

  public void setDownloading_block_index(int value) {
    libtorrent_jni.peer_info_downloading_block_index_set(swigCPtr, this, value);
  }

  public int getDownloading_block_index() {
    return libtorrent_jni.peer_info_downloading_block_index_get(swigCPtr, this);
  }

  public void setDownloading_progress(int value) {
    libtorrent_jni.peer_info_downloading_progress_set(swigCPtr, this, value);
  }

  public int getDownloading_progress() {
    return libtorrent_jni.peer_info_downloading_progress_get(swigCPtr, this);
  }

  public void setDownloading_total(int value) {
    libtorrent_jni.peer_info_downloading_total_set(swigCPtr, this, value);
  }

  public int getDownloading_total() {
    return libtorrent_jni.peer_info_downloading_total_get(swigCPtr, this);
  }

  public void setConnection_type(int value) {
    libtorrent_jni.peer_info_connection_type_set(swigCPtr, this, value);
  }

  public int getConnection_type() {
    return libtorrent_jni.peer_info_connection_type_get(swigCPtr, this);
  }

  public void setPending_disk_bytes(int value) {
    libtorrent_jni.peer_info_pending_disk_bytes_set(swigCPtr, this, value);
  }

  public int getPending_disk_bytes() {
    return libtorrent_jni.peer_info_pending_disk_bytes_get(swigCPtr, this);
  }

  public void setPending_disk_read_bytes(int value) {
    libtorrent_jni.peer_info_pending_disk_read_bytes_set(swigCPtr, this, value);
  }

  public int getPending_disk_read_bytes() {
    return libtorrent_jni.peer_info_pending_disk_read_bytes_get(swigCPtr, this);
  }

  public void setSend_quota(int value) {
    libtorrent_jni.peer_info_send_quota_set(swigCPtr, this, value);
  }

  public int getSend_quota() {
    return libtorrent_jni.peer_info_send_quota_get(swigCPtr, this);
  }

  public void setReceive_quota(int value) {
    libtorrent_jni.peer_info_receive_quota_set(swigCPtr, this, value);
  }

  public int getReceive_quota() {
    return libtorrent_jni.peer_info_receive_quota_get(swigCPtr, this);
  }

  public void setRtt(int value) {
    libtorrent_jni.peer_info_rtt_set(swigCPtr, this, value);
  }

  public int getRtt() {
    return libtorrent_jni.peer_info_rtt_get(swigCPtr, this);
  }

  public void setNum_pieces(int value) {
    libtorrent_jni.peer_info_num_pieces_set(swigCPtr, this, value);
  }

  public int getNum_pieces() {
    return libtorrent_jni.peer_info_num_pieces_get(swigCPtr, this);
  }

  public void setDownload_rate_peak(int value) {
    libtorrent_jni.peer_info_download_rate_peak_set(swigCPtr, this, value);
  }

  public int getDownload_rate_peak() {
    return libtorrent_jni.peer_info_download_rate_peak_get(swigCPtr, this);
  }

  public void setUpload_rate_peak(int value) {
    libtorrent_jni.peer_info_upload_rate_peak_set(swigCPtr, this, value);
  }

  public int getUpload_rate_peak() {
    return libtorrent_jni.peer_info_upload_rate_peak_get(swigCPtr, this);
  }

  public void setProgress(float value) {
    libtorrent_jni.peer_info_progress_set(swigCPtr, this, value);
  }

  public float getProgress() {
    return libtorrent_jni.peer_info_progress_get(swigCPtr, this);
  }

  public void setProgress_ppm(int value) {
    libtorrent_jni.peer_info_progress_ppm_set(swigCPtr, this, value);
  }

  public int getProgress_ppm() {
    return libtorrent_jni.peer_info_progress_ppm_get(swigCPtr, this);
  }

  public void setEstimated_reciprocation_rate(int value) {
    libtorrent_jni.peer_info_estimated_reciprocation_rate_set(swigCPtr, this, value);
  }

  public int getEstimated_reciprocation_rate() {
    return libtorrent_jni.peer_info_estimated_reciprocation_rate_get(swigCPtr, this);
  }

  public void setIp(tcp_endpoint value) {
    libtorrent_jni.peer_info_ip_set(swigCPtr, this, tcp_endpoint.getCPtr(value), value);
  }

  public tcp_endpoint getIp() {
    long cPtr = libtorrent_jni.peer_info_ip_get(swigCPtr, this);
    return (cPtr == 0) ? null : new tcp_endpoint(cPtr, false);
  }

  public void setLocal_endpoint(tcp_endpoint value) {
    libtorrent_jni.peer_info_local_endpoint_set(swigCPtr, this, tcp_endpoint.getCPtr(value), value);
  }

  public tcp_endpoint getLocal_endpoint() {
    long cPtr = libtorrent_jni.peer_info_local_endpoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new tcp_endpoint(cPtr, false);
  }

  public void setRead_state(bandwidth_state_flags_t value) {
    libtorrent_jni.peer_info_read_state_set(swigCPtr, this, bandwidth_state_flags_t.getCPtr(value), value);
  }

  public bandwidth_state_flags_t getRead_state() {
    long cPtr = libtorrent_jni.peer_info_read_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new bandwidth_state_flags_t(cPtr, false);
  }

  public void setWrite_state(bandwidth_state_flags_t value) {
    libtorrent_jni.peer_info_write_state_set(swigCPtr, this, bandwidth_state_flags_t.getCPtr(value), value);
  }

  public bandwidth_state_flags_t getWrite_state() {
    long cPtr = libtorrent_jni.peer_info_write_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new bandwidth_state_flags_t(cPtr, false);
  }

  public byte_vector get_client() {
    return new byte_vector(libtorrent_jni.peer_info_get_client(swigCPtr, this), true);
  }

  public long get_last_request() {
    return libtorrent_jni.peer_info_get_last_request(swigCPtr, this);
  }

  public long get_last_active() {
    return libtorrent_jni.peer_info_get_last_active(swigCPtr, this);
  }

  public long get_download_queue_time() {
    return libtorrent_jni.peer_info_get_download_queue_time(swigCPtr, this);
  }

  public int get_flags() {
    return libtorrent_jni.peer_info_get_flags(swigCPtr, this);
  }

  public byte get_source() {
    return libtorrent_jni.peer_info_get_source(swigCPtr, this);
  }

  public byte get_read_state() {
    return libtorrent_jni.peer_info_get_read_state(swigCPtr, this);
  }

  public byte get_write_state() {
    return libtorrent_jni.peer_info_get_write_state(swigCPtr, this);
  }

  public peer_info() {
    this(libtorrent_jni.new_peer_info(), true);
  }

  public final static peer_flags_t interesting = new peer_flags_t(libtorrent_jni.peer_info_interesting_get(), false);
  public final static peer_flags_t choked = new peer_flags_t(libtorrent_jni.peer_info_choked_get(), false);
  public final static peer_flags_t remote_interested = new peer_flags_t(libtorrent_jni.peer_info_remote_interested_get(), false);
  public final static peer_flags_t remote_choked = new peer_flags_t(libtorrent_jni.peer_info_remote_choked_get(), false);
  public final static peer_flags_t supports_extensions = new peer_flags_t(libtorrent_jni.peer_info_supports_extensions_get(), false);
  public final static peer_flags_t local_connection = new peer_flags_t(libtorrent_jni.peer_info_local_connection_get(), false);
  public final static peer_flags_t handshake = new peer_flags_t(libtorrent_jni.peer_info_handshake_get(), false);
  public final static peer_flags_t connecting = new peer_flags_t(libtorrent_jni.peer_info_connecting_get(), false);
  public final static peer_flags_t on_parole = new peer_flags_t(libtorrent_jni.peer_info_on_parole_get(), false);
  public final static peer_flags_t seed = new peer_flags_t(libtorrent_jni.peer_info_seed_get(), false);
  public final static peer_flags_t optimistic_unchoke = new peer_flags_t(libtorrent_jni.peer_info_optimistic_unchoke_get(), false);
  public final static peer_flags_t snubbed = new peer_flags_t(libtorrent_jni.peer_info_snubbed_get(), false);
  public final static peer_flags_t upload_only = new peer_flags_t(libtorrent_jni.peer_info_upload_only_get(), false);
  public final static peer_flags_t endgame_mode = new peer_flags_t(libtorrent_jni.peer_info_endgame_mode_get(), false);
  public final static peer_flags_t holepunched = new peer_flags_t(libtorrent_jni.peer_info_holepunched_get(), false);
  public final static peer_flags_t i2p_socket = new peer_flags_t(libtorrent_jni.peer_info_i2p_socket_get(), false);
  public final static peer_flags_t utp_socket = new peer_flags_t(libtorrent_jni.peer_info_utp_socket_get(), false);
  public final static peer_flags_t ssl_socket = new peer_flags_t(libtorrent_jni.peer_info_ssl_socket_get(), false);
  public final static peer_flags_t rc4_encrypted = new peer_flags_t(libtorrent_jni.peer_info_rc4_encrypted_get(), false);
  public final static peer_flags_t plaintext_encrypted = new peer_flags_t(libtorrent_jni.peer_info_plaintext_encrypted_get(), false);
  public final static peer_source_flags_t tracker = new peer_source_flags_t(libtorrent_jni.peer_info_tracker_get(), false);
  public final static peer_source_flags_t dht = new peer_source_flags_t(libtorrent_jni.peer_info_dht_get(), false);
  public final static peer_source_flags_t pex = new peer_source_flags_t(libtorrent_jni.peer_info_pex_get(), false);
  public final static peer_source_flags_t lsd = new peer_source_flags_t(libtorrent_jni.peer_info_lsd_get(), false);
  public final static peer_source_flags_t resume_data = new peer_source_flags_t(libtorrent_jni.peer_info_resume_data_get(), false);
  public final static peer_source_flags_t incoming = new peer_source_flags_t(libtorrent_jni.peer_info_incoming_get(), false);
  public final static class connection_type_t {
    public final static peer_info.connection_type_t standard_bittorrent = new peer_info.connection_type_t("standard_bittorrent", libtorrent_jni.peer_info_standard_bittorrent_get());
    public final static peer_info.connection_type_t web_seed = new peer_info.connection_type_t("web_seed", libtorrent_jni.peer_info_web_seed_get());
    public final static peer_info.connection_type_t http_seed = new peer_info.connection_type_t("http_seed", libtorrent_jni.peer_info_http_seed_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static connection_type_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + connection_type_t.class + " with value " + swigValue);
    }

    private connection_type_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private connection_type_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private connection_type_t(String swigName, connection_type_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static connection_type_t[] swigValues = { standard_bittorrent, web_seed, http_seed };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static bandwidth_state_flags_t bw_idle = new bandwidth_state_flags_t(libtorrent_jni.peer_info_bw_idle_get(), false);
  public final static bandwidth_state_flags_t bw_limit = new bandwidth_state_flags_t(libtorrent_jni.peer_info_bw_limit_get(), false);
  public final static bandwidth_state_flags_t bw_network = new bandwidth_state_flags_t(libtorrent_jni.peer_info_bw_network_get(), false);
  public final static bandwidth_state_flags_t bw_disk = new bandwidth_state_flags_t(libtorrent_jni.peer_info_bw_disk_get(), false);
}
