using Application.DAOInterfaces;
using Application.Logic;
using Application.LogicInterfaces;
using GrpcClient.Converters;
using GrpcClient.DAOs;
using GrpcClient.IConverters;


var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

builder.Services.AddScoped<IFoodPostConverter, FoodPostConverter>();
builder.Services.AddScoped<IFoodPostDao, FoodPostDao>();
builder.Services.AddScoped<IFoodPostLogic, FoodPostLogic>();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseCors(x => x
    .AllowAnyMethod()
    .AllowAnyHeader()
    .SetIsOriginAllowed(origin => true) // allow any origin
    .AllowCredentials());

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();

app.Run();