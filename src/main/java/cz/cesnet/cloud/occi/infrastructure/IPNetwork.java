package cz.cesnet.cloud.occi.infrastructure;

import cz.cesnet.cloud.occi.Model;
import cz.cesnet.cloud.occi.core.Kind;
import cz.cesnet.cloud.occi.exception.InvalidAttributeValueException;
import cz.cesnet.cloud.occi.infrastructure.enumeration.Allocation;

public class IPNetwork extends Network {

    public static final String ADDRESS_ATTRIBUTE_NAME = "occi.network.address";
    public static final String GATEWAY_ATTRIBUTE_NAME = "occi.network.gateway";
    public static final String ALLOCATION_ATTRIBUTE_NAME = "occi.network.allocation";

    public IPNetwork(String id, Kind kind, String title, Model model, String summary) throws InvalidAttributeValueException {
        super(id, kind, title, model, summary);
    }

    public IPNetwork(String id, Kind kind) throws InvalidAttributeValueException {
        super(id, kind);
    }

    public String getAddress() {
        return getValue(ADDRESS_ATTRIBUTE_NAME);
    }

    public void setAddress(String address) throws InvalidAttributeValueException {
        addAttribute(ADDRESS_ATTRIBUTE_NAME, address);
    }

    public String getGateway() {
        return getValue(GATEWAY_ATTRIBUTE_NAME);
    }

    public void setGateway(String gateway) throws InvalidAttributeValueException {
        addAttribute(GATEWAY_ATTRIBUTE_NAME, gateway);
    }

    public String getAllocation() {
        return getValue(ALLOCATION_ATTRIBUTE_NAME);
    }

    public void setAllocation(Allocation allocation) throws InvalidAttributeValueException {
        addAttribute(ALLOCATION_ATTRIBUTE_NAME, allocation.toString());
    }

    public void setAllocation(String allocationName) throws InvalidAttributeValueException {
        addAttribute(ALLOCATION_ATTRIBUTE_NAME, allocationName);
    }
}
