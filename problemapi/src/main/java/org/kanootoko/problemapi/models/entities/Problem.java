package org.kanootoko.problemapi.models.entities;

import java.time.LocalDate;

import org.json.simple.JSONObject;
import org.kanootoko.problemapi.models.Coordinates;

public class Problem {
    private Integer id;
    private Integer outerID;
    private String name;
    private String region;
    private String status;
    private LocalDate creationDate;
    private LocalDate updateDate;
    private String description;
    private String userName;
    private Integer userID;
    private Coordinates coordinates;
    private String address;
    private String municipality;
    private String reason;
    private String category;
    private String subcategory;

    public Problem(Integer id, Integer outerID, String name, String region, String status, LocalDate creationDate,
            LocalDate updateDate, String description, String userName, Integer userID, Coordinates coordinates,
            String address, String municipality, String reason, String category, String subcategory) {
        this.id = id;
        this.outerID = outerID;
        this.name = name;
        this.region = region;
        this.status = status;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.description = description;
        this.userName = userName;
        this.userID = userID;
        this.coordinates = coordinates;
        this.address = address;
        this.municipality = municipality;
        this.reason = reason;
        this.category = category;
        this.subcategory = subcategory;
    }

    public Integer getId() {
        return id;
    }

    public Integer getOuterID() {
        return outerID;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public String getDescription() {
        return description;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getUserID() {
        return userID;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String getAddress() {
        return address;
    }

    public String getMunicipality() {
        return municipality;
    }

    public String getReason() {
        return reason;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    @SuppressWarnings("unchecked")
    public JSONObject getLinks() {
        JSONObject res = new JSONObject();
        res.put("self", "/problems/" + id);
        return res;
    }

    @SuppressWarnings("unchecked")
    public JSONObject toJSON() {
        JSONObject res = new JSONObject();
        res.put("id", id);
        res.put("outerID", outerID);
        res.put("name", name);
        res.put("region", region);
        res.put("status", status);
        res.put("creationDate", creationDate.toString());
        res.put("updateDate", updateDate.toString());
        res.put("description", description);
        res.put("userName", userName);
        res.put("userID", userID);
        res.put("coordinates", coordinates.toJSONArray());
        res.put("address", address == null ? "" : address);
        res.put("municipality", municipality);
        res.put("reason", reason);
        res.put("category", category);
        res.put("subcategory", subcategory);

        res.put("_links", getLinks());
        return res;
    }

    @Override
    public String toString() {
        return String.format(
                "Problem{ID: %d, OuterID: %d, Name: %s, Region: %s, Status: %s,"
                        + " CreationDate: %s, UpdateDate: %s, Description: %s, UserName: %s, UserID: %d,"
                        + " Coordinates: %s, Address: %s, Municipality: %s, Reason: %s, Category: %s, Subcategory: %s}",
                id, outerID, name, region, status, creationDate, updateDate, description, userName, userID,
                coordinates.toString(), address, municipality, reason, category, subcategory);
    }
}