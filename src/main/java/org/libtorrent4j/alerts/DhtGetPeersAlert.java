package org.libtorrent4j.alerts;

import org.libtorrent4j.Sha1Hash;
import org.libtorrent4j.swig.dht_get_peers_alert;

/**
 * This alert is generated when a DHT node sends a ``get_peers`` message to
 * our DHT node. It belongs to the ``dht_notification`` category.
 *
 * @author gubatron
 * @author aldenml
 */
public final class DhtGetPeersAlert extends AbstractAlert<dht_get_peers_alert> {

    DhtGetPeersAlert(dht_get_peers_alert alert) {
        super(alert);
    }

    /**
     * @return the hash
     */
    public Sha1Hash infoHash() {
        return new Sha1Hash(alert.getInfo_hash());
    }
}
